package com.company;

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

    private boolean isTriangle () {
        boolean areValuesPositive = t1 > 0 && t2 > 0 && t3 > 0;
        boolean isTriangleInequalityTheorem = (t1+t2 > t3) && ( t1+t3 > t2) && (t2+t3 > t1);
        boolean is180 = ((ang1 + ang2 + ang3) == 180);

        return areValuesPositive && isTriangleInequalityTheorem && is180;
    }
}
