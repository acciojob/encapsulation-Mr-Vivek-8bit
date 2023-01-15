package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        RWOnly rw = new RWOnly();

        rw.setName("xyz");
        System.out.println(rw.getName());

        // java: name has private access in com.driver.RWOnly
    }

}