package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectdaf2 {

        Projectdaf2Delegate projectdaf2Delegate = new Projectdaf2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectdaf2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}