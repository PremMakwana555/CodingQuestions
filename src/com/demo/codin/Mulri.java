package com.demo.codin;

public class Mulri implements Runnable{



    public void run() {
        System.out.printf("TAX ");
        System.out.printf("WAR ");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Mulri());

        thread.start();

        System.out.println("WARS ");

        try {
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("for ");
    }
}
