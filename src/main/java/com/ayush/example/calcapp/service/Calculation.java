package com.ayush.example.calcapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculation {
   Logger logger = LoggerFactory.getLogger(Calculation.class);
    public double add(double a , double b){
        logger.debug("adding");
        return a+b;
    }
    public double sub(double a , double b){
        logger.debug("sub");
        return a-b;
    }
    public double mul(double a , double b){
        logger.debug("multiplying");
        return a*b;
    }
}
