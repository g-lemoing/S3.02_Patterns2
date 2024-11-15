package nivell2.modules;

import nivell2.interfaces.Agency;

public class StockExchangeAgency implements Agency {
    private String name;
    private String event;

    public StockExchangeAgency(String name){
        this.name = name;
    }
    @Override
    public void update(String event) {
        this.event= event;
        displayEvent();
    }
    public void displayEvent(){
        System.out.println("Avis " + this.name + ", la borsa està " + event + ".");
    }
}
