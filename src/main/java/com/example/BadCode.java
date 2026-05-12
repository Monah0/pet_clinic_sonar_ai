package com.example;

import java.util.ArrayList;
import java.util.List;

public class BadCode {

    public void test() {

        String s = null;
        s.length(); // NullPointer risk

        if (true == true) {
            System.out.println("debug");
        }

        List list = new ArrayList();

        int unusedVariable = 42;

        try {
            int x = 1 / 0;
        }
        catch (Exception e) {
        }

    }

}