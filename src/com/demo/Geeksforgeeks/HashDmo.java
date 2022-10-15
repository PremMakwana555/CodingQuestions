package com.demo.Geeksforgeeks;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashDmo {
    public static void main(String[] args) {


        final Map<String,Boolean> mpa = new Hashtable<String, Boolean>();

//        mpa.put(null,null);
//        mpa.put(null,false);
//        mpa.put(null,true);
        mpa.put("Prem",true);
        mpa.put("RAju",false);
        mpa.put("Babu",true);
        mpa.put("Shyam",false);

//        System.out.println(mpa.get(null));
//        for (Hashtable<String,Boolean> m : mpa){
//
//        }
        mpa.forEach((k,v) -> System.out.println(mpa.get(k)));





    }
}
