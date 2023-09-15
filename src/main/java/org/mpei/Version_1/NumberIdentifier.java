package org.mpei.Version_1;

import java.util.regex.Pattern;

public class NumberIdentifier {
    public static boolean isArabicNumber(String number) {
        if (Pattern.matches("\\d+", number)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isRomanNumber(String number) {
        switch (number) {
            case ("O"):
                return true;
            case ("I"):
                return true;
            case ("II"):
                return true;
            case ("III"):
                return true;
            case ("IV"):
                return true;
            case ("V"):
                return true;
            case ("VI"):
                return true;
            case ("VII"):
                return true;
            case ("VIII"):
                return true;
            case ("IX"):
                return true;
            case ("X"):
                return true;
            default:
                return false;
        }
    }
}
