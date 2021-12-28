package org.designpatterns.behavioral.command;

public class Receiver {

// keeps the state
    boolean isOn = false;

    public void toggle(){
        isOn=!isOn;

        System.out.println("--------------- toggle to "+isOn+"----------------");
    }
}
