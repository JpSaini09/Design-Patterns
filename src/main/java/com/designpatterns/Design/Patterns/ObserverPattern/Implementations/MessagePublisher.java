package com.designpatterns.Design.Patterns.ObserverPattern.Implementations;

import com.designpatterns.Design.Patterns.ObserverPattern.Interfaces.Observable;
import com.designpatterns.Design.Patterns.ObserverPattern.Interfaces.Observer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessagePublisher implements Observable {

    private List<Observer> listenersList = new ArrayList<Observer>();
    private int testMessageCode  = 0;

    @Override
    public void addObserver(Observer o) {
        listenersList.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        listenersList.remove(o);
    }

    @Override
    public void notifyUpdate() {
        for (Observer observer : listenersList) {
            observer.update(this);
        }
    }

    public void updateTestMessageCode() {
        testMessageCode = testMessageCode + 1;
        notifyUpdate();
    }

    @Override
    public int getState() {
        return testMessageCode;
    }
}
