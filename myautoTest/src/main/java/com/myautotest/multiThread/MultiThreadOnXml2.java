package com.myautotest.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml2 {

    @Test
    public  void test1(){
        System.out.println("class2 "+Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test2(){
        System.out.println("class2 "+Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test3(){
        System.out.println("class2 "+Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test4(){
        System.out.println("class2 "+Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
    @Test
    public  void test5(){
        System.out.println("class2 "+Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
}
