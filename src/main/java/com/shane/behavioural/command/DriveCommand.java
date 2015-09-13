package com.shane.behavioural.command;

/**
 * Created by SHANE on 2015/03/13.
 */
public class DriveCommand implements Command {

    Drive drive;

    public DriveCommand(Drive drive) {
        this.drive = drive;
    }

    @Override
    public void execute() {
        drive.startCar();
    }
}
