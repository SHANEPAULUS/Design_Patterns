package com.shane.behavioural.observer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * Created by SHANE on 2015/03/13.
 */
public class MovieTheater implements MovieSubject {

    Set<MovieObserver> movieObserverSet;
    String title;

    public MovieTheater(String title) {
        movieObserverSet=new HashSet<MovieObserver>();
        this.title = title;
    }

    @Override
    public void addObserver(MovieObserver movieObserver) {
        movieObserverSet.add(movieObserver);
    }

    @Override
    public void removeObserver(MovieObserver movieObserver) {
        movieObserverSet.remove(movieObserver);
    }

    @Override
    public void doNotify() {
        Iterator<MovieObserver> iterate=movieObserverSet.iterator();
        while(iterate.hasNext())
        {
            MovieObserver movieObserver=iterate.next();
            movieObserver.doUpdate(title);
        }
    }

    public void setTitle(String title)
    {
        System.out.println("Movie Theater is setting latest movie to "+title);
        this.title=title;
        doNotify();
    }
}
