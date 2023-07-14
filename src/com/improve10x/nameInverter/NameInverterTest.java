package com.improve10x.nameInverter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NameInverterTest {

    private NameInverter nameInverter;

    @Before
    public void setup() {
        nameInverter = new NameInverter();
    }

    @Test
    public void nothing() {

    }

    // input String -"" , output String - ""
    @Test
    public void givenEmpty_returnEmpty() {
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    //input "name" , output "name"
    @Test
    public void givenSingleWord_returnSingleWord() {
        String invertedName = nameInverter.invertName("name");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord() {
        String invertedName = nameInverter.invertName("name   ");
        assertEquals("name", invertedName);
    }

    @Test
    public void givenSingleWordWithBeginningSpaces_returnSingleWord() {
        String invertedName = nameInverter.invertName("   name   ");
        assertEquals("name", invertedName);
    }

    //input "first last" , output "last, first"
    @Test
    public void givenFirstLast_returnInvertName() {
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first",  invertedName);
    }

    //input "Mrs. first last" , output "last, first"
    @Test
    public void givenHonorifics_ignoreHonorifics() {
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMrHonorifics_ignoreHonorifics() {
        String invertedName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenPostNominals_stayAtEnd () {
        String invertedName = nameInverter.invertName("first last MSc.");
        assertEquals("last, first MSc.", invertedName);
    }
    @Test
    public void givenMultiPostNominals_stayAtEnd () {
        String invertedName = nameInverter.invertName("first last MSc. PhD");
        assertEquals("last, first MSc. PhD", invertedName);
    }

     @Test
    public void integrationTest() {
        String invertedName = nameInverter.invertName("Mr. Bob Martins MSc. PhD");
        assertEquals("Martins, Bob MSc. PhD", invertedName);
    }
}
