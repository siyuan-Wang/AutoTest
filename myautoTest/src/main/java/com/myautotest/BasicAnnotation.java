package com.myautotest;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void myTest(){
        System.out.println("这个是test方法");
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("这个是beforemethod方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这个是beforeclass 执行的方法");
    }
    @AfterClass
    public void affterClass(){
        System.out.println("这个是affterclass 执行的方法");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这个是beforesuit执行发放");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("这个是aftersuit执行发放");
    }

}
