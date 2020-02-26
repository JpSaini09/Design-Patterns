package com.designpatterns.Design.Patterns.ObserverPattern.Interfaces;

import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.MessagePublisher;

/**
 * Subscriber method to be implemented by listener classes.
 */

public interface Observer {
    void update(MessagePublisher m);
}
