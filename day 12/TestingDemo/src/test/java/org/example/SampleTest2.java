package org.example;

import org.junit.jupiter.api.*;

public class SampleTest2 {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All Test Cases");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All Test Cases");
    }

    // before each test case i want to do something
    @BeforeEach
    public void setUp(){
        System.out.println("DB Connected");
    }

    // after each test case i want to do something
    @AfterEach
    public void tearDown(){
        System.out.println("DB dis-Connected");
    }

    @Test
    public void myTest1(){
        System.out.println("Test1 executed");
    }

    @Test
    public void myTest2(){
        System.out.println("Test2 executed");
    }
}
