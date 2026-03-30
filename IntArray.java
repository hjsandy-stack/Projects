import java.util.Random;
import java.util.Arrays;

public class IntArray {

    // private data fields
    private int length;
    private int myArray[];

    // constructor
    public IntArray(int size) {
        length = size;
        myArray = new int[size];
    }

    // returns size of array
    public int size() {
        return length;
    }

    // fills array with random numbers 1–6
    public void fillRand() {
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // set value at index
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArray[index] = value;
        }
    }

    // get value at index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        }
        return -1;
    }

    // clears the array
    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    // checks if empty
    public boolean isEmpty() {
        return length == 0;
    }

    // 🔥 MANUAL BUBBLE SORT (this is what you needed)
    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {

                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }

            }
        }
    }

    // toString method (prevents IntArray@xxxx)
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}