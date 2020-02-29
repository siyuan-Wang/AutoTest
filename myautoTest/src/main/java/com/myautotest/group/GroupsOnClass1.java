package com.myautotest.group;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass1 {
    public void test1(){
        System.out.println("goc111111中的test1");
    }
    public void test2(){
        System.out.println("goc111111中的test2");
    }
}
