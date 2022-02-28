package com.testcases;

import com.bridgelab.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void checkMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.checkSad("This is a sad message");
        Assertions.assertEquals("SAD",result);
    }

    @Test
    void givenFirstNameMessage_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkName("Akshata");
        Assertions.assertEquals(true, result);
    }

    @Test
    void givenLaststNameMessage_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkName("Hasabi");
        Assertions.assertEquals(true, result);
    }

    @Test
    void givenMobileNumberPattern_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkMobileFormat("+91 9611858146");
        Assertions.assertEquals(true, result);
    }

    @Test
    void givenMobilePasswordPattern_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkPassword("akshuh@123");
        Assertions.assertEquals(true, result);
    }
}

