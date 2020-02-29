package com.myautotest;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptiontest(){
        System.out.println("这是一个异常测试");
        throw new RuntimeException();
    }
}
