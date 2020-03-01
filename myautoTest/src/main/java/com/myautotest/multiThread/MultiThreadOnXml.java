package com.myautotest.multiThread;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public  void test1(){
        Reporter.log("这个是MultiThreadOnXml 类的test1方法的日志");
        System.out.println(Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test2(){
        Reporter.log("这个是MultiThreadOnXml 类的test222方法的日志");
        System.out.println(Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test3(){
        System.out.println(Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test4(){
        System.out.println(Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test5(){
        System.out.println(Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
}
