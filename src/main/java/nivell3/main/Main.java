package nivell3.main;

import nivell3.modules.Menu;

public class Main {
    public static void main(String[] args) {
        byte sel;
        do {
            sel = Menu.selMenu();
        }while (sel !=0);
    }

}
