package com.myautotest.multiThread;

import org.testng.annotations.Test;

public class MultiThreadTest {

    @Test(invocationCount = 11,threadPoolSize = 3)
    public  void test(){
        System.out.println(Thread.currentThread().getName().toString()+" "+Thread.currentThread().getId());
    }
}
