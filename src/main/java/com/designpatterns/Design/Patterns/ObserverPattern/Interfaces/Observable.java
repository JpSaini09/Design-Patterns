package com.designpatterns.Design.Patterns.ObserverPattern.Interfaces;

/**
 * Publisher interface with abstract methods to be implemented by the subjects.
 */

public interface Observable {
    void addObserver(Observer o);

    void removerObserver(Observer o);

    void notifyUpdate();

    int getState();
}
