package com.hello;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {
    HelloWorld hello;
    
    @Before
    public void init(){
        hello = new HelloWorld();
    }
    
    @Test
    public void testHello() {
        Assert.assertEquals("Hello World!", hello.helloWorld());
    }
}