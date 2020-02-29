package com.myautotest.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


public class GroupOnMethodTest {

    @Test(groups="server")
    public  void serverTest1(){
        System.out.println("这个是服务端测试11111");
    }
    @Test(groups="client")
    public  void clientTest1(){
        System.out.println("这个是客户端测试222222");
    }

    @BeforeGroups("server")
    public void befoerServer(){
        System.out.println("这个是beforegroup server的方法");
    }
    @AfterGroups("server")
    public void afterServer(){
        System.out.println("这个是aftergroup server的方法");
    }


}

