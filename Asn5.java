import java.util.ArrayList;

public class Asn5 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nNumbers List:");
        for (int num : numbers) {
            System.out.println(num);
        }


        fruits.remove(1); // removes "Banana"
        numbers.remove(2); // removes 30


        fruits.add(1, "Mango");
        numbers.add(2, 99);


        System.out.println("\nUpdated Fruits List:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\nUpdated Numbers List:");
        numbers.forEach(num -> System.out.println(num));
    }
}