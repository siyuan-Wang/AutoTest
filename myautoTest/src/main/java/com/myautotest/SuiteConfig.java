package com.myautotest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这个是beforesuit的方法");
    }
    @AfterSuite
    public void affterSuite(){
        System.out.println("这个是afftersuite的方法");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforetest 的方法");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("aftertest 的方法");
    }
}
