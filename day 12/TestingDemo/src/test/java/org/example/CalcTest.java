package org.example;

import org.junit.jupiter.api.*;

public class CalcTest {

    private Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }

    @AfterEach
    public void tearDown(){
        calc = null;
    }

    @Test
    public void addTest(){
        Assertions.assertEquals(10, calc.add(4, 6));
        Assertions.assertEquals(2, calc.add(4, -6));
        Assertions.assertNotEquals(0, calc.add(4, -6));
    }

    @Test
    public void subTest(){
        Assertions.assertEquals(10, calc.sub(4, -6));

    }

    @Test
    public void mulTest(){
        Assertions.assertEquals(2, calc.mul(4, 2));
    }

    @Disabled
    @Test
    public void divTest(){
        Assertions.assertEquals(10, calc.div(5, 2));
    }


}
