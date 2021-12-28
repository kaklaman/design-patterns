package org.designpatterns.behavioral.command;

public class ConcreteCommand implements Command {

    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver=receiver;
    }

    public void execute() {

        this.receiver.toggle();
    }
}
