package org.example;

import org.junit.Test;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertTrue;

public class AppTest 
{
    @BeforeAll
    public static  void init (){
        System.out.println("Before All init() method called");
    }

    @RepeatedTest(5)
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) throws MyException {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(36, App.squareMethod(3, 4, 5), "square should equal 36");
    }

    @BeforeEach
    public void initEach(){
        System.out.println("BeforeEach initEach() method called");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }
}
