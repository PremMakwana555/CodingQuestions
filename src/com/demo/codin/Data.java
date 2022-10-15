package com.demo.codin;

public class Data {

    private int data;

    public Data() {
       data = 5;
    }

    public int getData() {
        return this.data;
    }
}

class mob extends Data{

    private int data;

    public mob() {
        data = 6;
    }

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        mob mo = new mob();
        System.out.println(mo.getData());
    }
}
