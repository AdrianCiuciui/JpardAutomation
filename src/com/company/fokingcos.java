package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class fokingcos {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
int t1 = 30;
int t2 = 30;
int t3 = 22;
double ang2, ang3, ang1;
df2.setRoundingMode(RoundingMode.HALF_UP);

        double m2 = (double)(t1*t1 + t3*t3 - t2*t2) / (2 * t1 * t3);
        ang2 = Math.round
                (Math.toDegrees
                        (Math.acos
                                (Double.parseDouble(df2.format(m2)))));

        double m3 = (double)(t2*t2 + t3*t3 - t1*t1) / (2 * t2 * t3);
        ang3 = Math.round
                (Math.toDegrees
                        (Math.acos
                                (Double.parseDouble(df2.format(m3)))));

        double m1 = (double)(t2*t2 + t1*t1 - t3*t3) / (2 * t1 * t2);
        ang1 = Math.round
                (Math.toDegrees
                        (Math.acos
                                (Double.parseDouble(df2.format(m1)))));

        System.out.println("\nang2 = " + ang2);
        System.out.println("ang3 = " + ang3);
        System.out.println("ang1 = " + ang1);

        System.out.println("\nM2 = " + Double.parseDouble(df2.format(m2)) + "\nM3 = " + Double.parseDouble(df2.format(m3)) + "\nM1 = " + Double.parseDouble(df2.format(m1)));
        System.out.println("\nsum = " + (ang1 + ang2 + ang3));

    }

}

//        System.out.println("Test data: Obtuz: 78/315/258   Isoscel 30/30/10   Drept 3/4/5   Drept Isoscel 198 140   Scalene 6/5/4\n");
