package com.designpatterns.Design.Patterns.ObserverPattern.Interfaces;

import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.MessagePublisher;

/**
 *
 */

public interface Observable {
    public void addObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyUpdate();
    public int getState();
}
