package com.improve10x.namegreeting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameGreetingTest {

    private NameGreeting nameGreeting;

    @Before
    public void setup() {
        nameGreeting = new NameGreeting();    }

    @Test
    public void nothing() {
    }

    //haelloName("") = ("hello !")
    @Test
    public void givenEmptyName_returnEmptyName() {
        String name = nameGreeting.setNameGreeting("");
        assertEquals("hello !", name);
    }

    //helloName( “Geraid”)     = “ Hello Geraid! ”
    @Test
    public void givenNameGeraid_returnHelloGeraidExclamationMark() {
        String name = nameGreeting.setNameGreeting("Geraid");
        assertEquals("Hello Geraid!", name);
    }

    //helloName( “Ed”)    = “ Hello Ed! ”
    @Test
    public void givenNameEd_returnHelloEdExclamationMark() {
        String name = nameGreeting.setNameGreeting("Ed");
        assertEquals("Hello Ed!", name);
    }

    //  helloName( “Tiffany”)    = “ Hello Tiffany! ”
    @Test
    public void givenNameTiffany_returnHelloTiffanyExclamationMark() {
        String name = nameGreeting.setNameGreeting("Tiffany");
        assertEquals("Hello Tiffany!", name);
    }
}
