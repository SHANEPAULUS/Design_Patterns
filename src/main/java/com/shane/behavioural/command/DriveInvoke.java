package com.shane.behavioural.command;

/**
 * Created by SHANE on 2015/03/13.
 */
public class DriveInvoke {
    Command command;

    public DriveInvoke(Command command) {
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
