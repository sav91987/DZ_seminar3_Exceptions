package Model;

public class PowerCalculator {

    public int sum(int a, int b) throws ArithmeticException {
        if (a > Integer.MAX_VALUE / b)
            throw new ArithmeticException("ArithmeticException: ");

        return a + b;
    }

    public int sub(int a, int b) throws ArithmeticException {
        if (a < b)
            throw new ArithmeticException("ArithmeticException: ");
        return a - b;
    }

    public int multi(int a, int b) throws ArithmeticException {
        if (a > Integer.MAX_VALUE / b)
            throw new ArithmeticException("ArithmeticException: ");
        return a * b;
    }

    public double div(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("ArithmeticException: ");
        return a / b;
    }

    public double calculatePower(int a, int b) throws InvalidInputException {
        if (a == 0 || b < 0)
            throw new InvalidInputException("InvalidInputException: ");
        return Math.pow(a, b);
    }
}
