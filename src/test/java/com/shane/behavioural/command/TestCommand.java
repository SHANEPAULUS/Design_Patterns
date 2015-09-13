package com.shane.behavioural.command;

import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestCommand {
    Drive drive;
    Stop stop;
    Command driveCommand;
    Command stopCommand;
    CarInvoke invoker;

    @Test
    public void testDrive() throws Exception {
        drive=new Drive();
        driveCommand=new DriveCommand(drive);

        stop=new Stop();
        stopCommand=new StopCommand(stop);

        invoker=new CarInvoke(driveCommand);
        invoker.Invoke();

        invoker.setCommand(stopCommand);
        invoker.Invoke();

    }
}
