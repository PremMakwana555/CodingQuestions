package com.demo.codin;

public class Building {

    public Building() {
        System.out.println("Mors-buildiong");
    }
    public Building(String name) {

        this();
        System.out.println("Mors-buildiong  "+ name);
    }
}

class house extends Building{

    house(){
        System.out.println("Mors-House");
    }
    house(String name ){
        this();
        System.out.println("Mors-House" + name);
    }
    public static void main(String[] args) {
        new house("Prem");
    }

}
