/**
 * The Exam class extends the Assessment class and
 * calculates a student's exam score based on the
 * number of questions and the number missed.
 */
public class Exam extends Assessment {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    /**
     * Constructor initializes exam data and calculates score.
     * Throws exceptions if invalid data is provided.
     *
     * @param questions total number of questions
     * @param missed number of questions missed
     */
    public Exam(int questions, int missed) {

        // Validate input to prevent invalid calculations
        if (questions <= 0) {
            throw new IllegalArgumentException(
                    "Number of questions must be greater than zero.");
        }

        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException(
                    "Missed questions must be between 0 and total questions.");
        }

        numQuestions = questions;
        numMissed = missed;

        // Calculate points per question
        pointsEach = 100.0 / questions;

        // Calculate final score
        int numericScore = (int) Math.round(100.0 - (missed * pointsEach));

        // Set score using inherited method
        setScore(numericScore);
    }

    /**
     * Returns total number of questions.
     */
    public int getNumQuestions() {
        return numQuestions;
    }

    /**
     * Returns points per question (rounded to 2 decimals).
     */
    public double getPointsEach() {
        return Math.round(pointsEach * 100.0) / 100.0;
    }

    /**
     * Returns number of missed questions.
     */
    public int getNumMissed() {
        return numMissed;
    }
}