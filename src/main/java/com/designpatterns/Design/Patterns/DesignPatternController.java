package com.designpatterns.Design.Patterns;

import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.ListenerOne;
import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.ListenerThree;
import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.ListenerTwo;
import com.designpatterns.Design.Patterns.ObserverPattern.Implementations.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pattern")
public class DesignPatternController {

    private MessagePublisher  messagePublisher;

    @Autowired
    DesignPatternController(MessagePublisher messagePublisher, ListenerOne listenerOne, ListenerTwo listenerTwo, ListenerThree listenerThree) {
        this.messagePublisher = messagePublisher;
        messagePublisher.addObserver(listenerOne);
        messagePublisher.addObserver(listenerTwo);
        messagePublisher.addObserver(listenerThree);
    }

    @RequestMapping(value = "/observer", method = RequestMethod.GET)
    public void observerPattern() {
        messagePublisher.updateTestMessageCode();
    }
}
