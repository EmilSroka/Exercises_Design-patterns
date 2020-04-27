package pl.emilsroka.observer.end;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

     protected void notifyObservers(){
        for(var observer : observers){
            observer.update(this);
        }
    }
}
