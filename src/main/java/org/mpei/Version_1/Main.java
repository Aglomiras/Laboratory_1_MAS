package org.mpei.Version_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberIdentifier nunIn = new NumberIdentifier();
        Scanner matic = new Scanner(System.in);

        System.out.println("Здравствуйте! Вас приветствует калькулятор арабских и римских чисел. " + "\n" +
                "Каждая операнда и операция вводятся через отдельные вводы. Необходимый порядок ввода: " + "\n" +
                "- Первая операнда" + "\n" + "- Производимая операция" + "\n" + "- Вторая операнда\n" +
                "Римские цифры вводятся с клавиатуры английскими буквами с использованием верхнего регистра!\n");
        System.out.println("Введите первый операнд: ");
        String operandOne = matic.nextLine();
        System.out.println("Введите арифметическую операцию: ");
        String operation = matic.nextLine();
        System.out.println("Введите второй операнд: ");
        String operandTwo = matic.nextLine();

        if (nunIn.isArabicNumber(operandOne) && nunIn.isArabicNumber(operandTwo)) {
            ArabicCalcs arabicCalcs = new ArabicCalcs();
            switch (operation) {
                case ("+"):
                    arabicCalcs.addition(operandOne, operandTwo);
                    break;
                case ("-"):
                    arabicCalcs.subtraction(operandOne, operandTwo);
                    break;
                case ("*"):
                    arabicCalcs.multiplication(operandOne, operandTwo);
                    break;
                case ("/"):
                    arabicCalcs.division(operandOne, operandTwo);
                    break;
                default:
                    System.out.println("Ошибка ввода оператора");
                    break;
            }
        } else if (nunIn.isRomanNumber(operandOne) && nunIn.isRomanNumber(operandTwo)) {
            RomanCalcs romanCalcs = new RomanCalcs();
            switch (operation) {
                case ("+"):
                    romanCalcs.addition(operandOne, operandTwo);
                    break;
                case ("-"):
                    romanCalcs.subtraction(operandOne, operandTwo);
                    break;
                case ("*"):
                    romanCalcs.multiplication(operandOne, operandTwo);
                    break;
                case ("/"):
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