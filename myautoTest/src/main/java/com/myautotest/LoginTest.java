package com.myautotest;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void Login(){
        System.out.println("登录成功");
    }
    //通过enable 标签不执行test
    @Test(enabled = false)
    public void ignore(){
        System.out.println("这个是不执行的测试方法");
    }

}
