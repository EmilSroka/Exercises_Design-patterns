package pl.emilsroka.mediator.end;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    List<UIObserver> observers = new ArrayList<>();

    public void attach(UIObserver observer){
        observers.add(observer);
    }

    public void detach(UIObserver observer){
        observers.remove(observer);
    }

    protected void notifySubscribers(){
        for(var observer : observers){
            observer.update(this);
        }
    }
}
