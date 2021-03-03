package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        Second version of Ex1 <<<<<<<<<<<<<<<<<<<<

//        System.out.println("\n\nExercise #1\n Select a value to be displayed");
//        int ex1int = scanner.nextInt();
//        scanner.nextLine();
//        Exercitiul1 exercise1 = new Exercitiul1(ex1int);
//        exercise1.print();


//        First version of ex2
//        System.out.println("\n\nExercise #2 - true/false pentru numere pozitive\n Input how many numbers you want");
//        int ex2int = scanner.nextInt();
//        scanner.nextLine();
//        Exercitiul2 ex2 = new Exercitiul2(ex2int);
//        ex2.inputArray();
////        ex2.outputArray();
//        ex2.isOk();


//        Second version of ex2 <<<<<<<<<<<<<<<<<<<

//        System.out.println("\nExercitiul #2. True/false pentru numere pozitive\n Input the array SIZE");
//        try  {
//            int ex2ArraySize = scanner.nextInt();
//            scanner.nextLine();
//            Exercitiul2 exercitiul2 = new Exercitiul2();
//            if (!exercitiul2.isNumeric(ex2ArraySize)) System.out.println("Invalid number");
//            else {
//                int[] arrayWithNumbers = exercitiul2.inputAndReturnArray(ex2ArraySize);
//                System.out.println("Please input the number of positive values you wish to test");
//                int positiveNumbers = scanner.nextInt();
//                scanner.nextLine();
//                if (!exercitiul2.isNumberValid(positiveNumbers, ex2ArraySize))
//                    System.out.println("Invalid number");
//                else {
//                    if (!exercitiul2.isOk2(arrayWithNumbers, ex2ArraySize))
//                        System.out.println("Nu sunt destule numere pozitive in arrray");
//                    else
//                        System.out.println("Array-ul contine cel putin " + ex2ArraySize + " numere pozitive");
//                }
//            }
//        }
//        catch (Exception e) {
//            System.out.println("Invalid number");
//            scanner.nextLine();
//        }

//      First version of ex3
//        System.out.println("\n\n Exercise #3 - Numarul cel mai mare\nInput how many numbers you want");
//        int ex3int = scanner.nextInt();
//        scanner.nextLine();
//        Exercitiul2 ex3 = new Exercitiul2(ex3int);
//        ex3.inputArray();
//        System.out.println("The highest number is " + ex3.highestNumber());

//        Exercitiul 3, v2 <<<<<<<<<<<<<<<<

//        System.out.println("\n\n Exercise #3 - Numarul cel mai mare\nInput array size");
//        Exercitiul2 exercitiul3 = new Exercitiul2();
//        int ex3ArraySize = scanner.nextInt();
//        scanner.nextLine();
//        int[] ex3ArrayWithNumbers = new int[ex3ArraySize];
//        if (!exercitiul3.isNumeric(ex3ArraySize)) System.out.println("Invalid number");
//        else {
//            ex3ArrayWithNumbers = exercitiul3.inputAndReturnArray(ex3ArraySize);
//        }
//        System.out.println("The highest number from the given array is: " + exercitiul3.highestNumber(ex3ArrayWithNumbers));



//        Exercitiul 4, v1
//        System.out.println("\n\n Exercise #4 - Triunghi: Tip, perimetru, arie.\nInput the length, 3 int values are expected");
//        System.out.println("Test data: Obtuz: 78/315/258   Isoscel 30/30/10   Drept 3/4/5   Drept Isoscel 198 140   Scalene 6/5/4");
//        int[] triangle = new int[3];
//        triangle[0] = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("ok");
//        triangle[1] = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("ok");
//        triangle[2] = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("ok");
//        Exercitiul4 ex4 = new Exercitiul4(triangle[0], triangle[1], triangle[2]);
//        ex4.tip();
//        ex4.perimetru();
//        ex4.arie();


//        Exercitiul 4, v2
        System.out.println("\n\n Exercise #4 - Triunghi: Tip, perimetru, arie.\n\n");
//        System.out.println("Test data: Obtuz: 78/315/258   Isoscel 30/30/10   Drept 3/4/5   Drept Isoscel 198 140   Scalene 6/5/4\n");
        Exercitiul4 exercitiul4 = new Exercitiul4();
        int length1 = 198;
        int length2 = 140;
        int length3 = 198;
        if (exercitiul4.isTriangle_v2(length1, length2, length3)) {
            System.out.println("Avem un triunghi valid\n");
        }
        else {
            System.out.println("\n!!! Valorile nu pot crea un triunghi\n");
        }

        if (exercitiul4.isIsoscel_v2(length1, length2, length3)) {
            System.out.println("Triunghiul este isoscel");
        }
        else {
            System.out.println("\n!!! Valorile nu pot crea un triunghi isoscel\n");
        }

        if (exercitiul4.isEchilateral_v2(length1, length2, length3)) {
            System.out.println("Triunghiul este echilateral");
        }
        else {
            System.out.println("\n!!! Valorile nu pot crea un triunghi echilateral\n");
        }


// Exercitiul 6
//	Array/Siruri: o functie care are parametru de intrare un sir si returneaza MIN
        int[] array = {2, 3, 0, 100, 200, -33};
        Exercitiul2 exercitiul6 = new Exercitiul2();
        System.out.println("\nExercitiul #6 - minim din array.\nNumarul cel mai mic din array este: " + exercitiul6.minimumValue(array));

//Exercitiul #7
//	Siruri: o functie care are parametru de intrare un sir si returneaza SUMA

        int[] array7 = {2, 3, 0, 100};
        Exercitiul2 exercitiul7 = new Exercitiul2();
        exercitiul7.calculateSum (array7);
        System.out.println("\nExercitiul #7 - suma din array.\nSuma numerelor din array este: " + exercitiul7.calculateSum (array7));














    }
}