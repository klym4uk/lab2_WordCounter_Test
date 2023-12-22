package com.example.lab20;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestingWordCounterMethods {
    @Test
    public void emptyInputCharsCountTest(){
        final String inputRow = "";
        final int expectedResult = 0;
        final int actualResult = WordCounter.getCharsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void emptyInputWordsCountTest(){
        final String inputRow = "";
        final int expectedResult = 0;
        final int actualResult = WordCounter.getWordsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void validInputCharsCountTest(){
        final String inputRow = "Testing chars count";
        final int expectedResult = 17;
        final int actualResult = WordCounter.getCharsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void validInputWordsCountTest(){
        final String inputRow = "Testing words count";
        final int expectedResult = 3;
        final int actualResult = WordCounter.getWordsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void validExtendedWithSpacesInputCharsCountTest(){
        final String inputRow = "Testing    chars                count";
        final int expectedResult = 17;
        final int actualResult = WordCounter.getCharsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void validExtendedWithSpacesInputWordsCountTest(){
        final String inputRow = "Testing    words        count";
        final int expectedResult = 3;
        final int actualResult = WordCounter.getWordsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }



    @Test
    public void spacesInputCharsCountTest(){
        final String inputRow = "          ";
        final int expectedResult = 0;
        final int actualResult = WordCounter.getCharsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void spacesInputWordsCountTest(){
        final String inputRow = "          ";
        final int expectedResult = 0;
        final int actualResult = WordCounter.getWordsCount(inputRow);

        assertEquals(expectedResult, actualResult);
    }


}