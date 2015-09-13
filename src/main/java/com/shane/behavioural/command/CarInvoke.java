package com.shane.behavioural.command;

/**
 * Created by SHANE on 2015/03/13.
 */
public class CarInvoke {
    Command command;

    public CarInvoke(Command command) {
        this.command = command;
    }

    public void setCommand(Command cmd)
    {
        this.command=cmd;
    }

    public void Invoke()
    {
        command.execute();
    }
}
