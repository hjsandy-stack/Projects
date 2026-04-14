
public class Exam extends Assessment {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;


    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;

        int numericScore = (int) Math.round(100.0 - (missed * pointsEach));
        setScore(numericScore);
    }


    public int getNumQuestions() {
        return numQuestions;
    }


    public double getPointsEach() {
        return Math.round(pointsEach * 100.0) / 100.0;
    }


    public int getNumMissed() {
        return numMissed;
    }
}
