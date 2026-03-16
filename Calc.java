import java.util.Scanner;

public class Calc {

    private double num1;
    private double num2;

    public Calc() {
        num1 = 0;
        num2 = 0;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    public double getValidNumber(Scanner scan, String prompt) {
        while (true) {
            System.out.println(prompt);

            if (scan.hasNextDouble()) {
                return scan.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scan.next(); // clears the bad input
            }
        }
    }

    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}