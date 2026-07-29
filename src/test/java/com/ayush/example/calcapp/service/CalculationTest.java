package com.ayush.example.calcapp.service;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculationTest {
    Calculation calculation;

    Logger logger = LoggerFactory.getLogger(CalculationTest.class);

    @BeforeEach
    public void setup(){
        logger.info("setup started");
        this.calculation = new Calculation();
    }
    @Test
    public void testAdd(){
        Assertions.assertNotNull(calculation,"object is null");
        Assertions.assertEquals(13,calculation.add(9,4));


    }
  @Test
    public void testSub(){
        Assertions.assertNotNull(calculation,"object is null");
        Assertions.assertEquals(5,calculation.sub(9,4));


    }
    @Test
    public void testMul(){
        Assertions.assertNotNull(calculation,"object is null");
        Assertions.assertEquals(12,calculation.mul(3,4));


    }

    @AfterEach
    public void done(){
        logger.info("setup ended");
        this.calculation =null;
    }

}
