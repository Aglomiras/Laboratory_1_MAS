package org.mpei.Version_2;

public class ArabicCalcs extends Calculations {
    @Override
    public void addition(String valA, String valB) {
        int intValA = Integer.parseInt(valA);
        int intValB = Integer.parseInt(valB);
        System.out.println(intValA + intValB);
    }

    @Override
    public void subtraction(String valA, String valB) {
        int intValA = Integer.parseInt(valA);
        int intValB = Integer.parseInt(valB);
        System.out.println(intValA - intValB);
    }

    @Override
    public void multiplication(String valA, String valB) {
        int intValA = Integer.parseInt(valA);
        int intValB = Integer.parseInt(valB);
        System.out.println(intValA * intValB);
    }

    @Override
    public void division(String valA, String valB) {
        int intValA = Integer.parseInt(valA);
        int intValB = Integer.parseInt(valB);
        if (intValB == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println(intValA / intValB);
        }

    }
}
