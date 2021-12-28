package org.designpatterns.behavioral.command;


//client
public class CommandDemo {
    public static void main(String args[]) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();

        invoker.invokeCommand(command);
        invoker.invokeCommand(command);
        invoker.invokeCommand(command);
        invoker.invokeCommand(command);
        invoker.invokeCommand(command);
        invoker.invokeCommand(command);



    }


}
