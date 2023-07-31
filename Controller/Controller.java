package Controller;

import Model.InvalidInputException;
import Model.PowerCalculator;
import View.Printer;

public class Controller {
    
    public void run(int firstNum, int secondNum) {

        Printer<? super Object> print = new Printer<>();

        PowerCalculator operation = new PowerCalculator();
        try {
            print.print(operation.sum(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Переполнение типа int!");
        }

        try {
            print.print(operation.sub(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Уменьшаемое меньше вычитаемого!");
        }

        try {
            print.print(operation.multi(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Переполнение типа int!");
        }

        try {
            print.print(operation.div(firstNum, secondNum));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Деление на 0!");
        }

        try {
            print.print(operation.calculatePower(firstNum, secondNum));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage() + "Некорретное основание или степень");
        }

    }

}
