package com.shane.behavioural.memento;

/**
 * Created by SHANE on 2015/09/13.
 */
public class JogInfo {

    String personName;
    int dayNumber;
    int distance;

    public JogInfo(String personName, int dayNumber, int distance) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.distance = distance;
    }

    public void setDayNumberAndDistance(int dayNumber,int distance)
    {
        this.dayNumber=dayNumber;
        this.distance=distance;
    }

    public Memento save()
    {
        return new Memento(personName,dayNumber,distance);
    }

    public void restore(Object objectMem)
    {
        Memento memento=(Memento)objectMem;
        personName=memento.mementoPersonName;
        dayNumber=memento.mementoDayNumber;
        distance=memento.mementoDistance;
    }

    private class Memento{
        String mementoPersonName;
        int mementoDayNumber;
        int mementoDistance;

        public Memento(String mementoPersonName, int mementoDayNumber, int mementoDistance) {
            this.mementoPersonName = mementoPersonName;
            this.mementoDayNumber = mementoDayNumber;
            this.mementoDistance = mementoDistance;
        }
    }

    @Override
    public String toString() {
        return "JogInfo{" +
                "personName='" + personName + '\'' +
                ", day=" + dayNumber +
                ", distance=" + distance +
                '}';
    }
}
