package org.mpei.Version_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberIdentifier nunIn = new NumberIdentifier();
        Scanner matic = new Scanner(System.in);

        System.out.println("Введите выражение на арабских числах [2+2] или на римских числах от I до X: [V+V] + Enter");
        String oper = matic.nextLine();
        char[] operChar = new char[10];
        char operation = ' ';

        for (int i = 0; i < oper.length(); i++) {
            operChar[i] = oper.charAt(i);
            if (operChar[i] == '+') {
                operation = '+';
            }
            if (operChar[i] == '-') {
                operation = '-';
            }
            if (operChar[i] == '*') {
                operation = '*';
            }
            if (operChar[i] == '/') {
                operation = '/';
            }
        }

        String operString = String.valueOf(operChar);
        String[] operMass = operString.split("[+-/*]");
        String operandOne = operMass[0].trim();
        String operandTwo = operMass[1].trim();

        if (nunIn.isArabicNumber(operandOne) && nunIn.isArabicNumber(operandTwo)) {
            ArabicCalcs arabicCalcs = new ArabicCalcs();
            switch (operation) {
                case ('+'):
                    arabicCalcs.addition(operandOne, operandTwo);
                    break;
                case ('-'):
                    arabicCalcs.subtraction(operandOne, operandTwo);
                    break;
                case ('*'):
                    arabicCalcs.multiplication(operandOne, operandTwo);
                    break;
                case ('/'):
                    arabicCalcs.division(operandOne, operandTwo);
                    break;
                default:
                    System.out.println("Ошибка ввода оператора");
                    break;
            }
        } else if (nunIn.isRomanNumber(operandOne) && nunIn.isRomanNumber(operandTwo)) {
            RomanCalcs romanCalcs = new RomanCalcs();
            switch (operation) {
                case ('+'):
                    romanCalcs.addition(operandOne, operandTwo);
                    break;
                case ('-'):
                    romanCalcs.subtraction(operandOne, operandTwo);
                    break;
                case ('*'):
                    romanCalcs.multiplication(operandOne, operandTwo);
                    break;
                case ('/'):
                    romanCalcs.division(operandOne, operandTwo);
                    break;
                default:
                    System.out.println("Ошибка ввода оператора");
                    break;
            }
        } else {
            System.out.println("Неверный формат чисел");
        }
    }
}