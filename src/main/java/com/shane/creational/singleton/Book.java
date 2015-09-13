package com.shane.creational.singleton;

/**
 * Created by SHANE on 2015/03/11.
 */
public class Book {

    private static Book book=null;
    private String title;

    private Book(){
    }

    public static Book getInstance()
    {
        if(book==null){
            book=new Book();
        }
        return book;
    }

    public String getTitle()
    {
        return "Singleton Pattern";
    }
}
