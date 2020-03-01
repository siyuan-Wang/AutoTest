package com.myautotest.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class DPParameter {
    @Test(dataProvider = "dp2")
    public  void test1(String name ,int age){
        System.out.print(name+" 的价格是： "+age );
    }

    @Test(dataProvider = "dp2")
    public  void test2(String name ,int age){
        System.out.print(name+" 的价格是： "+age );
    }

    @DataProvider(name = "dp")
    public Object[][] dataProvider(){
        Object[][] dp =new Object[][]{
                {"小米",200},{"苹果",3000}
        };
        return dp;

    }

    @DataProvider(name = "dp2")
    public Object[][] dataProvider(Method method){
        Object[][] dp2;
        if(method.getName().equals("test1")){
                dp2=new Object[][]{{"随地",222},{"夏红",1231}};
        }else {
            dp2=new Object[][]{{"力求",442},{"fee",5531}};
        }


        return dp2;

    }


}
