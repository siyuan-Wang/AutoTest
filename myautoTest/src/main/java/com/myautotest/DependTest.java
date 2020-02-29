package com.myautotest;

import org.testng.annotations.Test;

public class DependTest {

    //如果test1失败了，那么test2会被ignore
    @Test
    public void test1(){
        System.out.println("这个是方法11111111");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("这个是方法2222221");
    }
}
