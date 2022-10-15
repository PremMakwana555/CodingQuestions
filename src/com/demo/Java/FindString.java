package com.demo.Java;

import java.util.Arrays;
import java.util.List;

public class FindString {

    public static void main(String[] args) {

        String temp = "Who own the own good who good of venda from";

        getCountString(temp);
    }

    private static void getCountString(String temp) {

        List<String> list = Arrays.asList(temp.split(" "));


    }
}
