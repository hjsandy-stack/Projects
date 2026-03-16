import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Calc myCalculator = new Calc();

        Scanner scan = new Scanner(System.in);

        double n1 = myCalculator.getValidNumber(scan, "Please enter the first number: ");
        double n2 = myCalculator.getValidNumber(scan, "Please enter the second number: ");

        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        System.out.println(myCalculator);

        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
}
