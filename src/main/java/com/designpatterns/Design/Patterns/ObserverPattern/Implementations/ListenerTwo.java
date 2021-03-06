package com.designpatterns.Design.Patterns.ObserverPattern.Implementations;

import com.designpatterns.Design.Patterns.ObserverPattern.Interfaces.Observer;
import org.springframework.stereotype.Service;

@Service
public class ListenerTwo implements Observer {

    @Override
    public void update(MessagePublisher m) {
        System.out.println("MessageSubscriberTwo :: " + m.getState());
    }
}
