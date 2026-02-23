import java.util.Scanner;

public class Tests {

    private double ave;
    private int count;
    private int score;

    public Tests() {
        ave = 0.0;
        count = 0;
        score = 0;
    }
    public double getAve() {
        return ave;
    }
    public int getCount() {
        return count;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }

    public void getAverage() {

        Scanner input = new Scanner(System.in);

        double sum = 0.0;
        count = 0;

        System.out.print("Enter test scores (-1 to quit): ");
        score = input.nextInt();

        while (score != -1) {

            sum += score;
            count++;

            score = input.nextInt();
        }

        ave = sum / count;
    }
    public String toString() {
        return String.format(
                "The average of the %d scores entered is %.2f.",
                count, ave);
    }
}
