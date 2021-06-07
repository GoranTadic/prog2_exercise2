package trafficlight.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> allObserver = new ArrayList<Observer>();



    public void registerObserver(Observer obs){
        allObserver.add(obs);
    }

    public void unregisteredObserver(Observer obs){
        allObserver.remove(obs);

    }

    public void notifyObservers(String string){
        for(Observer obs:allObserver){
            obs.update(string);
        }
    }
}
