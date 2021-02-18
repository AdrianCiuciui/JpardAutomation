package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul2 {

    int numberInput;
    int [] numberArray;

    public Exercitiul2(int numberInput) {
        this.numberInput = numberInput;
        this.numberArray = new int[numberInput];
    }

    public void inputArray () {
        Scanner scanner = new Scanner(System.in);
        int i = this.numberInput;
        int position = 1;
        while (i > 0) {
            System.out.println("Input number " + position);
            this.numberArray[position - 1] = scanner.nextInt();
            position++;
            scanner.nextLine();
            i--;
        }
    }

    public void outputArray() {
        System.out.println(Arrays.toString(this.numberArray));
    }

    public void isOk() {
        int j = 0;
        for (int i=0; i < this.numberInput; i++) {
            if (this.numberArray[i] > 0) j++;
        }
        if (j > (this.numberInput -1)) System.out.println("TRUE. There are at least " + j + " positive numbers.");
        else System.out.println("FALSE. Not enough positive numbers.");
    }

    public int highestNumber () {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberInput; i++) {
            if (numberArray[i] > max) max = numberArray[i];
        }
        return max;
    }

}
