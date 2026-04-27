import java.io.*;
import java.util.*;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Skip header line from input file
            reader.readLine();

            // Add header to output file
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String empID = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hours = Double.parseDouble(data[2]);

                double weeklyPay;

                if (hours > 40) {
                    double overtime = hours - 40;
                    weeklyPay = (40 * payRate) + (overtime * payRate * 1.5);
                } else {
                    weeklyPay = hours * payRate;
                }

                String formattedPay = String.format("$%.2f", weeklyPay);

                String outputLine = empID + "," + payRate + "," + hours + "," + formattedPay;

                writer.write(outputLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File processed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
