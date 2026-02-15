
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Pet p1 = new Pet();
        System.out.println(p1.toString());

        Pet p2 = new Pet("Dog", "Buster", 11);
        System.out.println(p2.toString());

        System.out.println("Enter animal type:");
        String type = input.nextLine();

        System.out.println("Enter animal name:");
        String name = input.nextLine();

        System.out.println("Enter animal age:");
        int age = input.nextInt();

        Pet p3 = new Pet();
        p3.setType(type);
        p3.setName(name);
        p3.setAge(age);

        System.out.println();
        System.out.println(p3.toString());

        input.close();
    }
}
