package com.company;

public class fokingcos {

    public static void main(String[] args) {
int t1 = 22;
int t2 = 22;
int t3 = 22;
double ang2;

        double m = (double)(t1*t1 + t3*t3 - t2*t2) / (2 * t1 * t3);


        ang2 = Math.round
                (Math.toDegrees
                                (Math.acos
//                                        (Math.toRadians
                                                (m)                                        )
//                )
                );
        System.out.println("ang2 = " + ang2);


        System.out.println("M = " + m);

    }

}
