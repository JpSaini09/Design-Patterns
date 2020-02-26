package com.designpatterns.Design.Patterns.ObserverPattern.Interfaces;

import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.MessagePublisher;

/**
 *
 */

public interface Observer {
    public void update(MessagePublisher m);
}
