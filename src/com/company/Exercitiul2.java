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

    public Exercitiul2() {
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

    public int[] inputAndReturnArray (int size) {
        int[] completeArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        int position = 1;
        while (size > 0) {
            try {
                System.out.println("Input number " + position);
                completeArray[position - 1] = scanner.nextInt();
                position++;
                scanner.nextLine();
                size--;
            }
            catch (Exception e) {
                System.out.println("Invalid input, please try again");
                scanner.nextLine();
            }
        }
            return completeArray;
    }

    public boolean isNumberValid (int numberToTest, int arraySize) {
        return numberToTest >= 0 && numberToTest <= arraySize;
    }


    public void isOk() {
        int j = 0;
        for (int i=0; i < this.numberInput; i++) {
            if (this.numberArray[i] > 0) j++;
        }
        if (j > (this.numberInput -1)) System.out.println("TRUE. There are at least " + j + " positive numbers.");
        else System.out.println("FALSE. Not enough positive numbers.");
    }

    public boolean isOk2(int[] numbersArray, int positiveNumber) {
//        boolean isArrayNumerical = true;
//        for (int j : numbersArray) {
//            if (!isNumeric(j)) return false;
//        }
        for (int j : numbersArray) {
            if (j > 0) positiveNumber--;
        }
        return !(positiveNumber > 0);



//        return isArrayNumerical;
    }

    public int highestNumber () {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberInput; i++) {
            if (numberArray[i] > max) max = numberArray[i];
        }
        return max;
    }

    public int highestNumber (int[] numbersArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > max) max = numbersArray[i];
        }
        return max;
    }

    public boolean isNumeric (int str) {
        String strs = String.valueOf(str);
        return strs.matches("-?\\d+(\\.\\d+)?");
    }


}
