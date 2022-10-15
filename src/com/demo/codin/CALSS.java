package com.demo.codin;

public class CALSS extends tt {

    public static String sing(){
        return "fa";
    }

    public static void main(String[] args) {
        CALSS dd =new CALSS();
        tt yy =new CALSS();

        System.out.println(dd.sing() +"  " + yy.sing());
    }

}

class tt {
    public static String sing(){
        return "la";
    }
}
