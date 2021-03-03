package com.company;

import java.text.DecimalFormat;

public class Exercitiul4 {

    int t1;
    int t2;
    int t3;
    double ang1;
    double ang2;
    double ang3;

    public Exercitiul4 (int t1,int t2,int t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        setAngles();
        if (!isTriangle()) System.out.println("Triangle not possible");
    }

    public Exercitiul4() {
    }

    public void perimetru () {
        if (isTriangle()) {
            System.out.println("PERIMETRUL este " + (this.t1 + this.t2 + this.t3));
        }
    }

    public void tip () {
        if (isTriangle()) {
            if (isEchilateral())  System.out.println("TIP - Triunghiul este echilateral");
            if (isIsoscel())      System.out.println("TIP - Triunghiul este isoscel");
            if (isDrept())        System.out.println("TIP - Triunghiul este drept");
            if (isObtuz())        System.out.println("TIP - Triunghiul este obtuz");
            if (isScalene())      System.out.println("TIP - Triunghiul nu are egalitati, e scalene, nici o congruenta");
            if (isAcute())        System.out.println("TIP - Triunghiul este acut, toate unghiurile sunt sub 90 grade");
        }
    }

    public void arie () {
        if (isTriangle()) {
            int s = (this.t1 + this.t2 + this.t3 ) / 2;
            System.out.println("ARIA triunghiului este: " + Math.sqrt(s * (s-t1) * (s-t2) * (s-t3)));
        }
    }





    private boolean isEchilateral () {
        return t1 == t2 && t1 == t3;
    }

    private boolean isIsoscel () {
        if (isEchilateral()) return false;
        return  (t1 == t2) || (t1 == t3) || (t2 == t3);
    }

    private boolean isDrept () {
        return (ang1 == 90) || (ang2 == 90) || ang3 == 90;
    }

    private boolean isAcute () {
        return ang1 < 90 && ang2 < 90 && ang3 < 90;
    }

    private boolean isScalene() {
        if (isEchilateral()) return false;
        return  !isIsoscel();
    }

    private boolean isObtuz () {
        return ang1 > 90 || ang2 > 90 || ang3 > 90;
    }

    private void setAngles () {
        double m1 = (double)(t2*t2 + t3*t3 - t1*t1) / (2 * t2 * t3);
        double m2 = (double)(t1*t1 + t3*t3 - t2*t2) / (2 * t1 * t3);
        double m3 = (double)(t1*t1 + t2*t2 - t3*t3) / (2 * t1 * t2);
        ang1 = Math.round (Math.toDegrees (Math.acos (m1)));
        System.out.println("ang1 = " + ang1);

        ang2 = Math.round (Math.toDegrees (Math.acos (m2)));
        System.out.println("ang2 = " + ang2);

        ang3 = Math.round (Math.toDegrees (Math.acos (m3)));
        System.out.println("ang3 = " + ang3);
    }

    private boolean isTriangle () {
        boolean areValuesPositive = t1 > 0 && t2 > 0 && t3 > 0;
        boolean isTriangleInequalityTheorem = (t1+t2 > t3) && ( t1+t3 > t2) && (t2+t3 > t1);
        boolean is180 = ((ang1 + ang2 + ang3) == 180);

        return areValuesPositive && isTriangleInequalityTheorem && is180;
    }

    private boolean isTriangleCheck_v2(int length1, int length2, int length3) {
//        These are the properties of a triangle: https://e-gmat.com/blogs/properties-of-triangles/
//
//   X     1 A triangle has three sides, three angles, and three vertices.
//   X     2 The sum of all internal angles of a triangle is always equal to 1800. This is called the angle sum property of a triangle.
//   X     3 The sum of the length of any two sides of a triangle is greater than the length of the third side.
//   X     4 The side opposite to the largest angle of a triangle is the largest side.
//   -     5 Any exterior angle of the triangle is equal to the sum of its interior opposite angles. This is called the exterior angle property of a triangle.
        double[] angles = getAngles_v2(length1, length2, length3);
        boolean areValuesPositive = length1 > 0 && length2 > 0 && length3 > 0;
        boolean isTriangleInequalityTheorem = (length1+length2 > length3) && (length1+length3 > length2) && (length2+length3 > length1);
        boolean is180 = ((angles[0] + angles[1] + angles[2]) == 180);

//        return areValuesPositive && isTriangleInequalityTheorem && is180;
        return areValuesPositive && isTriangleInequalityTheorem;
    }

    private double[] getAngles_v2(int length1, int length2, int length3) {
        double[] anglesArray = new double[3];
        double ang1 = (double)(length2*length2 + length3*length3 - length1*length1) / (2 * length2 * length3);
        double ang2 = (double)(length1*length1 + length3*length3 - length2*length2) / (2 * length1 * length3);
        double ang3 = (double)(length1*length1 + length2*length2 - length3*length3) / (2 * length1 * length2);

        anglesArray[0] = Math.toDegrees (Math.acos (ang1));
        anglesArray[1] = Math.toDegrees (Math.acos (ang2));
        anglesArray[2] = Math.toDegrees (Math.acos (ang3));

        return anglesArray;
    }


    public boolean isTriangle_v2 (int length1, int length2, int length3) {
        if (isTriangleCheck_v2(length1, length2, length3)) {
            System.out.println("Perimetrul triunghiului: " + (length1 + length2 + length3));
            System.out.println("Aria triunghiului:       " + arieTriunghi_v2(length1, length2, length3));
            return true;
        }
        return false;
    }

    public boolean isIsoscel_v2 (int length1, int length2, int length3) {
        if ((length1 == length2) && (length3 == length2)) return false;
        if (!isTriangleCheck_v2(length1, length2, length3)) {
            return false;
        }
        if (((length1 == length2) || (length1 == length3) || (length2 == length3))) {
            System.out.println("Perimetrul isoscelului: " + (length1 + length2 + length3));
            System.out.println("Aria isoscelului:       " + arieTriunghi_v2(length1, length2, length3));
            return true;
        }
        return false;
    }

    public boolean isEchilateral_v2 (int length1, int length2, int length3) {
        if (!isTriangleCheck_v2(length1, length2, length3)) {
            return false;
        }
        if ((length1 == length2) && (length3 == length2)) {
            System.out.println("Perimetrul echilateralului: " + (length1 + length2 + length3));
            System.out.println("Aria echilateralului:       " + arieTriunghi_v2(length1, length2, length3));
            return true;
        }
        return false;
    }

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    private double arieTriunghi_v2 (int length1, int length2, int length3) {
        int s = (length1 + length2 + length3 ) / 2;
        return Double.parseDouble (df2.format (Math.sqrt (s * (s-length1) * (s-length2) * (s-length3))));
    }



}
