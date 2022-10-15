package com.demo.codin;

public class Question23 {

    int color;


    public static void main(String[] args) {
        Question23 we = new Question23();

        we.setColor(67);
        Question23 not = we;
        not.setColor(45);

        System.out.println(we.getColor());
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

}
