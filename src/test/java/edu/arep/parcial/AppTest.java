package edu.arep.parcial;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void unaryInvokeTest()
    {
        ChatGPT chat = new ChatGPT();
        int expected = 3;
        int result = (int) chat.unaryInvoke("java.lang.Integer", "valueOf", "String", "3");
        assertTrue(expected == result);
    }

    @Test
    public void binaryInvokeTest()
    {
        ChatGPT chat = new ChatGPT();
        
        int expected = 3;
        int result = (int) chat.binaryInvoke("java.lang.Integer",  "sum", "int", "6", "int", "-3");
        assertTrue(expected == result);
    }
}
