import static java.lang.Math.*;

public class Task121 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        int c = 20, d = 4;

        System.out.println("Addition of " + a + " and " + b + " = " + add(a, b));
        System.out.println("Subtraction of " + c + " and " + d + " = " + subtract(c, d));
        System.out.println("Multiplication of " + a + " and " + d + " = " + multiply(a, d));
        System.out.println("Division of " + c + " and " + b + " = " + divide(c, b));
    }
}
