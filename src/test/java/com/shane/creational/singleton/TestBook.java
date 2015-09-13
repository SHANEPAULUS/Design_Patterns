package com.shane.creational.singleton;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestBook {
    private Book myBook;

    @Test
    public void testBook() throws Exception {
        myBook=Book.getInstance();
        Assert.assertEquals(myBook.getTitle(),"Singleton Pattern");
    }
}
