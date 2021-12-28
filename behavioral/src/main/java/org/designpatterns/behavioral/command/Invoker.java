package org.designpatterns.behavioral.command;

public class Invoker {

    public void invokeCommand(Command command){
        command.execute();
    }
}
