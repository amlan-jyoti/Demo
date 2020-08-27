package com.sap.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testPos()
    {
        App app = new App();
        String expr = "[{()}]";
        Boolean isValid = app.validParanthesis(expr);
        assertEquals(true, isValid);
    }

    @Test
    public void testNeg()
    {
        App app = new App();
        String expr = "[[{()}]";
        Boolean isValid = app.validParanthesis(expr);
        assertEquals(false, isValid);
    }
}
