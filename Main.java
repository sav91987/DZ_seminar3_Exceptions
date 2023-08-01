import java.util.Scanner;
import Controller.Controller;
import View.Printer;

public class Main {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 0;
        Scanner scan = new Scanner(System.in);
        Printer<? super Object> print = new Printer<>();

        boolean flag = true;
        while (flag) {
            print.print("Введите первое число: ");
            if (scan.hasNextInt()) {
                firstNum = scan.nextInt();
                break;
            } else
                print.print("Введено не число!");
            scan.next();
        }

        while (flag) {
            print.print("Введите второе число: ");
            if (scan.hasNextInt()) {
                secondNum = scan.nextInt();
                break;
            } else
                print.print("Введено не число!");
            scan.next();
        }

        Controller start = new Controller();

        start.run(firstNum, secondNum);
    }
}
