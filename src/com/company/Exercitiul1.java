package com.company;

public class Exercitiul1 {

    int value;

    public Exercitiul1(int value) {
        this.value = value;
    }

    public void print () {
        for (int i=this.value; i > 0  ; i--){
//            int j = i;
//            while (j>0) {
//                System.out.print("*");
//                j--;
//            }
            for (int j = i; j > 0; j--) {
                if (j == 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
