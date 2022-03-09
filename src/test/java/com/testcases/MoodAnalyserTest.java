package com.testcases;

import com.bridgelab.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    static Scanner scanner = new Scanner(System.in);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("welcome to user registration regex");
    }

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
    @Test
    void givenEmailPattern_WhenProper_ShouldReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkEmail("akshuh818@gmail.com");
        Assertions.assertEquals(true, result);
    }

    @org.junit.jupiter.api.Test
    void givenFirName_WhenProper_ShouldReturnFalse() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean firstName = moodAnalyzer.userFirstName("abc");
        assertEquals(false,firstName);
    }

    @Test
    void givenLastName_WhenNotProper_ShouldReturnFalse() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean lastName = moodAnalyzer.userLastName("hasabi1");
        assertEquals(false,lastName);
    }

    @Test
    void givenLastName_WhenNotProper_ShouldReturnfalse() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean lastName = moodAnalyzer.userLastName("hasabi12");
        assertEquals(false,lastName);
    }

    @Test
    void givenEmailPattern_WhenNotProper_ShouldReturnFalse() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.userEmail(".akshuh818@gmail.com");
        Assertions.assertEquals(false, result);
    }
    @Test
    void givenPasswordPattern_WhenNotProper_ShouldReturnFalse() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.userPassword("+123abc");
        Assertions.assertEquals(false, result);
    }
}

