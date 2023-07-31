package Controller;

import Model.InvalidInputException;
import Model.PowerCalculator;
import View.Printer;

public class Controller {

    public void run(int firstNum, int secondNum) {

        Printer<? super Object> print = new Printer<>();

        PowerCalculator operation = new PowerCalculator();
        try {
            print.print("Результат сложения: " + operation.sum(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Переполнение типа int!");
        }

        try {
            print.print("Результат вычитания: " + operation.sub(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Уменьшаемое меньше вычитаемого!");
        }

        try {
            print.print("Результат умножения: " + operation.multi(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Переполнение типа int!");
        }

        try {
            print.print("Результат деления: " + operation.div(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Деление на 0!");
        }

        try {
            print.print("Результат возведения в степень: " + operation.calculatePower(firstNum, secondNum));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage() + "Некорретное основание или степень");
        }

    }

}
