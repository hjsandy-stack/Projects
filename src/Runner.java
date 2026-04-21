import javax.swing.JOptionPane;

/**
 * This program demonstrates the Exam class,
 * which extends the Assessment class.
 */
public class Runner {

    public static void main(String[] args)
    {
        String input;     // To hold input
        int questions = 0;    // Number of questions
        int missed = 0;       // Number of questions missed
        boolean valid = false; // Controls input validation

        // Get the number of questions on the exam
        while (!valid) {
            try {
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                questions = Integer.parseInt(input);

                // Prevent division by zero
                if (questions <= 0) {
                    throw new ArithmeticException();
                }

                valid = true; // valid input, exit loop
            } catch (NumberFormatException e) {
                // Handles non-numeric input such as "four"
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a whole number.");
            } catch (ArithmeticException e) {
                // Handles 0 or negative question counts
                JOptionPane.showMessageDialog(null,
                        "Number of questions must be greater than 0.");
            }
        }

        valid = false; // reset for second input

        // Get the number of questions the student missed
        while (!valid) {
            try {
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                missed = Integer.parseInt(input);

                // Validate missed questions
                if (missed < 0 || missed > questions) {
                    throw new IllegalArgumentException();
                }

                valid = true; // valid input, exit loop
            } catch (NumberFormatException e) {
                // Handles non-numeric input
                JOptionPane.showMessageDialog(null,
                        "Invalid input. Please enter a whole number.");
            } catch (IllegalArgumentException e) {
                // Handles impossible missed values
                JOptionPane.showMessageDialog(null,
                        "Missed questions must be between 0 and " + questions + ".");
            }
        }

        // Create an Exam object
        Exam exam = new Exam(questions, missed);

        // Display the test results
        String message = "Each question counts " + exam.getPointsEach();
        message += " points.\nThe exam score is " + exam.getScore();
        message += "\nThe exam grade is " + exam.getGrade();
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}