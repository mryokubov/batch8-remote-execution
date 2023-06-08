package com.academy.techcenture;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("Running before test");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Running after test");
    }

    @Test
    public void test1(){
        System.out.println("Running Test Case 1");
        Assert.assertTrue(1 == 1);
    }
    @Test
    public void test2(){
        System.out.println("Running Test Case 2");
        Assert.assertEquals("Hello", "Hello");
    }
    @Test
    public void test3(){
        System.out.println("Running Test Case 3");
        Assert.assertEquals(2,2);
    }
    @Test
    public void test4(){
        System.out.println("Running Test Case 4");
        Assert.assertEquals("Kevin","Kevin");
    }
    @Test
    public void test5(){
        System.out.println("Running Test Case 5");
        Assert.assertEquals(5,5);
    }

}
