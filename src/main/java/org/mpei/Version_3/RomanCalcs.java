package org.mpei.Version_3;

import java.util.HashMap;
import java.util.Map;

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

    public int romanToArabic(String val) {
        Map<String, Integer> romantoarabic = new HashMap<String, Integer>();
        romantoarabic.put("O", 0);
        romantoarabic.put("I", 1);
        romantoarabic.put("II", 2);
        romantoarabic.put("III", 3);
        romantoarabic.put("IV", 4);
        romantoarabic.put("V", 5);
        romantoarabic.put("VI", 6);
        romantoarabic.put("VII", 7);
        romantoarabic.put("VIII", 8);
        romantoarabic.put("IX", 9);
        romantoarabic.put("X", 10);

        int supflag = 0;
        for (String key: romantoarabic.keySet()) {
            if (key.equals(val)) {
                supflag = romantoarabic.get(key);
            }
        }
        return supflag;
    }

    public String arabicToRoman(int val) {
        Map<Integer, String> romantoarabic = new HashMap<Integer, String>();
        romantoarabic.put(0, "");
        romantoarabic.put(1, "I");
        romantoarabic.put(2, "II");
        romantoarabic.put(3, "III");
        romantoarabic.put(4, "IV");
        romantoarabic.put(5, "V");
        romantoarabic.put(6, "VI");
        romantoarabic.put(7, "VII");
        romantoarabic.put(8, "VIII");
        romantoarabic.put(9, "IX");
        romantoarabic.put(10, "X");

        String supflag = "";
        for (Integer key: romantoarabic.keySet()) {
            if (key.equals(val)) {
                supflag = romantoarabic.get(key);
            }
        }
        return supflag;
    }
    public void romanRes(int val) {
        int[] arrayKey = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrayVal = new String[]{"O", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};

        RomanCalcs romanCalcs = new RomanCalcs();
        if (val / 10 == 0 && val % 10 != 0) {
            System.out.println(romanCalcs.arabicToRoman(val));
        } else {
            for (int i = 0; i < arrayKey.length; i++) {
                if (val / 10 == arrayKey[i]) {
                    System.out.println(arrayVal[i] + romanCalcs.arabicToRoman(val % 10));
                }
            }
        }
    }
}
