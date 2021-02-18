package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nExercise #1\n Select a value to be displayed");
        int ex1int = scanner.nextInt();
        scanner.nextLine();
        Exercitiul1 exercise1 = new Exercitiul1(ex1int);
        exercise1.print();

        System.out.println("\n\nExercise #2 - true/false pentru numere pozitive\n Input how many numbers you want");
        int ex2int = scanner.nextInt();
        scanner.nextLine();
        Exercitiul2 ex2 = new Exercitiul2(ex2int);
        ex2.inputArray();
//        ex2.outputArray();
        ex2.isOk();

        System.out.println("\n\n Exercise #3 - Numarul cel mai mare\nInput how many numbers you want");
        int ex3int = scanner.nextInt();
        scanner.nextLine();
        Exercitiul2 ex3 = new Exercitiul2(ex3int);
        ex3.inputArray();
        System.out.println("The highest number is " + ex3.highestNumber());

        System.out.println("\n\n Exercise #4 - Triunghi: Tip, perimetru, arie.\nInput the length, 3 int values are expected");
        System.out.println("Test data: Obtuz: 78/315/258   Isoscel 30/30/10   Drept 3/4/5   Drept Isoscel 198 140   Scalene 6/5/4");
        int[] triangle = new int[3];
        triangle[0] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ok");
        triangle[1] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ok");
        triangle[2] = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ok");
        Exercitiul4 ex4 = new Exercitiul4(triangle[0], triangle[1], triangle[2]);
        ex4.tip();
        ex4.perimetru();
        ex4.arie();

        





    }
}
