package org.mpei;

public class RomanCalcs extends Calculations {
    @Override
    public void addition(String valA, String valB) {
        int intValA = romanToArabic(valA);
        int intValB = romanToArabic(valB);
        int intValC = intValA + intValB;
        romanRes(intValC);
    }

    @Override
    public void subtraction(String valA, String valB) {
        int intValA = romanToArabic(valA);
        int intValB = romanToArabic(valB);
        if (intValA < intValB) {
            System.out.println("Неположительный результат");
        } else {
            int intValC = intValA - intValB;
            romanRes(intValC);
        }
    }

    @Override
    public void multiplication(String valA, String valB) {
        int intValA = romanToArabic(valA);
        int intValB = romanToArabic(valB);
        int intValC = intValA * intValB;
        romanRes(intValC);
    }

    @Override
    public void division(String valA, String valB) {
        int intValA = romanToArabic(valA);
        int intValB = romanToArabic(valB);
        if (intValB == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            int intValC = intValA / intValB;
            romanRes(intValC);
        }
    }

    public static int romanToArabic(String val) {
        switch (val) {
            case ("O"):
                return 0;
            case ("I"):
                return 1;
            case ("II"):
                return 2;
            case ("III"):
                return 3;
            case ("IV"):
                return 4;
            case ("V"):
                return 5;
            case ("VI"):
                return 6;
            case ("VII"):
                return 7;
            case ("VIII"):
                return 8;
            case ("IX"):
                return 9;
            default:
                return 10;
        }
    }

    public static String arabicToRoman(int val) {
        switch (val) {
            case (0):
                return "O";
            case (1):
                return "I";
            case (2):
                return "II";
            case (3):
                return "III";
            case (4):
                return "IV";
            case (5):
                return "V";
            case (6):
                return "VI";
            case (7):
                return "VII";
            case (8):
                return "VIII";
            case (9):
                return "IX";
            default:
                return "X";
        }
    }
    public static void romanRes(int val) {
        if (val / 10 == 0) {
            System.out.println(arabicToRoman(val));
        } else if (val / 10 == 1) {
            System.out.println("X" + arabicToRoman(val % 10));
        } else if (val / 10 == 2) {
            System.out.println("XX" + arabicToRoman(val % 10));
        } else if (val / 10 == 3) {
            System.out.println("XXX" + arabicToRoman(val % 10));
        } else if (val / 10 == 4) {
            System.out.println("XL" + arabicToRoman(val % 10));
        } else if (val / 10 == 5) {
            System.out.println("L" + arabicToRoman(val % 10));
        } else if (val / 10 == 6) {
            System.out.println("LX" + arabicToRoman(val % 10));
        } else if (val / 10 == 7) {
            System.out.println("LXX" + arabicToRoman(val % 10));
        } else if (val / 10 == 8) {
            System.out.println("LXXX" + arabicToRoman(val % 10));
        } else if (val / 10 == 9) {
            System.out.println("XC" + arabicToRoman(val % 10));
        } else {
            System.out.println("C" + arabicToRoman(val % 10));
        }
    }
}
