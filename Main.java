import java.util.Scanner;
import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Введите первое число: ");
            if (scan.hasNextInt()) {
                firstNum = scan.nextInt();
                break;
            } else
                System.out.println("Введено не число!");
            scan.next();
        }

        while (flag) {
            System.out.println("Введите второе число: ");
            if (scan.hasNextInt()) {
                secondNum = Integer.parseInt(scan.next());
                break;
            } else
                System.out.println("Введено не число!");
            scan.next();
        }

        Controller start = new Controller();




        start.run(firstNum, secondNum);

    }
}
