package com.shane.behavioural.command;

/**
 * Created by SHANE on 2015/09/13.
 */
public class StopCommand implements Command {
    Stop stop;

    public StopCommand(Stop stop) {
        this.stop = stop;
    }

    @Override
    public void execute() {
        stop.stopCar();
    }
}
