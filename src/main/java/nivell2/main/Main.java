package nivell2.main;

import nivell2.modules.StockExchangeAgency;
import nivell2.modules.StockExchangeAgent;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nCreem 3 agències de borsa 'observers'.");
        System.out.println("L'agència 'observable' emet l'avis de que la borsa està pujant:");
        StockExchangeAgent stockExchangeAgent = new StockExchangeAgent();
        StockExchangeAgency agency1 = new StockExchangeAgency("Agencia 1");
        StockExchangeAgency agency2 = new StockExchangeAgency("Agencia 2");
        StockExchangeAgency agency3 = new StockExchangeAgency("Agencia 3");

        stockExchangeAgent.addObserver(agency1);
        stockExchangeAgent.addObserver(agency2);
        stockExchangeAgent.addObserver(agency3);

        stockExchangeAgent.setEvent("pujant");
        System.out.println("\nL'agència 'observable' emet l'avis de que la borsa està baixant:");
        stockExchangeAgent.setEvent("baixant");

        System.out.println("\nAra l'agència 2 esborra la seva subscripció a les alertes.");
        stockExchangeAgent.removeObserver(agency2);
        System.out.println("L'agència 'observable' emet l'avis de que la borsa està pujant:");
        stockExchangeAgent.setEvent("pujant");

    }
}
