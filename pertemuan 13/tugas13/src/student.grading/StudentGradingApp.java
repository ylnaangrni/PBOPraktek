package student.grading;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentGradingApp {
    private static final double ASSIGNMENT_WEIGHT = 0.20;
    private static final double MIDTERM_WEIGHT = 0.35;
    private static final double FINAL_WEIGHT = 0.45;

    private static final Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(StudentGradingApp.class.getName());

    public static void main(String[] args) {
        StudentGrade studentGrade = inputGrades();
        double finalScore = calculateFinalScore(studentGrade);
        String letterGrade = determineLetterGrade(finalScore);

        displayResults(studentGrade, finalScore, letterGrade);
    }

    private static StudentGrade inputGrades() {
        logger.log(Level.INFO, "Masukkan nilai yang dibutuhkan");

        logger.log(Level.INFO, "Nilai Tugas: ");
        int assignmentScore = scanner.nextInt();

        logger.log(Level.INFO, "Nilai UTS: ");
        int midtermScore = scanner.nextInt();

        logger.log(Level.INFO, "Nilai UAS: ");
        int finalScore = scanner.nextInt();

        return new StudentGrade(assignmentScore, midtermScore, finalScore);
    }

    private static double calculateFinalScore(StudentGrade grade) {
        double weightedAssignment = grade.getAssignmentScore() * ASSIGNMENT_WEIGHT;
        double weightedMidterm = grade.getMidtermScore() * MIDTERM_WEIGHT;
        double weightedFinal = grade.getFinalScore() * FINAL_WEIGHT;

        return weightedAssignment + weightedMidterm + weightedFinal;
    }

    private static String determineLetterGrade(double finalScore) {
        if (finalScore >= 85) return "A";
        if (finalScore >= 75) return "B";
        if (finalScore >= 65) return "C";
        if (finalScore >= 49) return "D";
        return "E";
    }

    private static void displayResults(StudentGrade grade, double finalScore, String letterGrade) {
        if (logger.isLoggable(Level.INFO)) {
            logger.log(Level.INFO, String.format("Nilai Tugas * %.0f%% = %.2f", 
                ASSIGNMENT_WEIGHT * 100, grade.getAssignmentScore() * ASSIGNMENT_WEIGHT));
            logger.log(Level.INFO, String.format("Nilai UTS * %.0f%% = %.2f", 
                MIDTERM_WEIGHT * 100, grade.getMidtermScore() * MIDTERM_WEIGHT));
            logger.log(Level.INFO, String.format("Nilai UAS * %.0f%% = %.2f", 
                FINAL_WEIGHT * 100, grade.getFinalScore() * FINAL_WEIGHT));
            logger.log(Level.INFO, String.format("Nilai akhir: %.2f", finalScore));
            logger.log(Level.INFO, String.format("Nilai akhir anda adalah %s", letterGrade)); // Perubahan di sini
        }
    }
}

class StudentGrade {
    private final int assignmentScore;
    private final int midtermScore;
    private final int finalScore;

    public StudentGrade(int assignmentScore, int midtermScore, int finalScore) {
        this.assignmentScore = assignmentScore;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public int getAssignmentScore() {
        return assignmentScore;
    }

    public int getMidtermScore() {
        return midtermScore;
    }

    public int getFinalScore() {
        return finalScore;
    }
}
