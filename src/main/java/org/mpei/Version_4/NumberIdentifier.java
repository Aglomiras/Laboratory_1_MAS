package org.mpei.Version_4;

import java.util.regex.Pattern;

public class NumberIdentifier {
    public boolean isArabicNumber(String number) {
        if (Pattern.matches("\\d+", number)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isRomanNumber(String number) {
        String[] arrNumber = new String[] {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean flag = false;
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i].equals(number)) {
                flag = true;
            }
        }
        return flag;
    }
}
