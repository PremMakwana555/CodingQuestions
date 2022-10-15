package com.demo.Practise;/* IMPORTANT: Multiple classes and nested static classes are supported */
//
//import java.util.*;
//
//class Demo {
//
//    static void segments(int p){
//
//        if(p == 0 || p ==1) {
//            return;
//        }
//
//        if( p % 2 == 1){
//            System.out.println("7");
//            segments(p - 3);
//        }
//
//        else if( p % 2 == 0){
//            System.out.println("1");
//            segments(p - 2);
//        }
//
//    }
//
//    public static void main(String args[] ) throws Exception {
//
//        Scanner s = new Scanner(System.in);
//
//        int x = s.nextInt();
//
//        int [] arr = new int[x];
//
//        for (int i =0; i < x; i ++){
//            arr[i]=s.nextInt();
//        }
//        int i =0;
//        while (x > 0){
//            segments(arr[i]);
//            x--;
//            i ++;
//        }
//
//
//    }
//}

import java.util.*;

class Demo{

    public static int fofo (){
        try{
            throw new Exception();
        }catch (Exception e){
            return 1;
        }
        finally {
            return 2;
        }

    }

    public static void main(String[] args) {

        System.out.println(fofo());

    }


}