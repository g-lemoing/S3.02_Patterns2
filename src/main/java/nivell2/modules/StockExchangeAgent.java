package nivell2.modules;

import nivell2.interfaces.Agency;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeAgent {
    private final List<Agency> agencies = new ArrayList<>();
    private String event;

    public void addObserver(Agency agency){
        this.agencies.add(agency);
    }

    public void removeObserver(Agency agency){
        this.agencies.remove(agency);
    }

    public void notifyAgencies(String event){
        this.event = event;
        agencies.forEach(agency -> agency.update(this.event));
    }

    public void setEvent(String event){
        this.event = event;
        notifyAgencies(this.event);
    }
}
