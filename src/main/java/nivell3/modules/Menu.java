package nivell3.modules;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte selMenu(){
        byte sel = -1;
        do {
            System.out.println("\n---- BOTIGA DE SABATES ----");
            System.out.println("0. Sortir de l'aplicació");
            System.out.println("1. Realitzar transacció");
            System.out.println("La teva selecció >> ");
            try {
                sel = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Opció errònia");
            }finally {
                scanner.nextLine();
            }
        }while(sel < 0 || sel > 1);

        if (sel == 1){
            menu();
        }else {
            System.out.println("Gràcies per utilitzar la passarel·la de pagament!");
        }
        return sel;
    }

    public static void menu() {
        boolean nextTransaction;
        do{
            double amount = askDouble("\nEntra l'import de la transacció: ");
            PaymentMethod paymentMethod = menuAskPaymentMethod(
                    "Entra el mètode de pagament [Targeta, Paypal, Domiciliacio] ");
            Payment payment = new Payment(amount, paymentMethod);

            ShoeShop shoeShop = new ShoeShop();
            shoeShop.callValidatePayment(payment);
            nextTransaction = Menu.askYesNo("Vol processar una nova transacció? S--> Sí, N --> No ");
        } while (nextTransaction);
    }

    public static double askDouble(String message){
        double price = -1;
        do{
            System.out.println(message);
            try {
                price = scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("El valor entrado tiene que ser un decimal superior a 0.");
            }
            finally {
                scanner.nextLine();
            }
        }while (price <= 0);
        return price;
    }
    public static PaymentMethod menuAskPaymentMethod(String message){
        String input;
        PaymentMethod paymentMethod = null;
        boolean isCorrect = false;
        do{
            System.out.println(message);
            try {
                input = scanner.nextLine();
                paymentMethod = PaymentMethod.valueOf(input);
                isCorrect = true;
            }catch (IllegalArgumentException e){
                System.out.println("Mètode de pagament desconegut");
            }
        }while (!isCorrect);
        return paymentMethod;
    }

    public static boolean askYesNo(String message){
        String result;
        do{
            System.out.println(message);
            result = scanner.nextLine().toUpperCase();
        }while (!result.matches("[SN]") );
        return result.equals("S");
    }
}
