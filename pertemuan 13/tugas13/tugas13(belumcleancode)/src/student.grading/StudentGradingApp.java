package student.grading;

import java.util.Scanner;

public class StudentGradingApp {
    private static final double ASSIGNMENT_WEIGHT = 0.20;
    private static final double MIDTERM_WEIGHT = 0.35;
    private static final double FINAL_WEIGHT = 0.45;
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentGrade studentGrade = inputGrades();
        double finalScore = calculateFinalScore(studentGrade);
        String letterGrade = determineLetterGrade(finalScore);
        
        displayResults(studentGrade, finalScore, letterGrade);
    }

    private static StudentGrade inputGrades() {
        System.out.println("Masukkan nilai yang dibutuhkan ");
        
        System.out.print("Nilai Tugas : ");
        int assignmentScore = scanner.nextInt();
        
        System.out.print("Nilai UTS : ");
        int midtermScore = scanner.nextInt();
        
        System.out.print("Nilai UAS : ");
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
        System.out.printf("Nilai Tugas * %.0f%% = %.2f%n", 
            ASSIGNMENT_WEIGHT * 100, grade.getAssignmentScore() * ASSIGNMENT_WEIGHT);
        System.out.printf("Nilai UTS * %.0f%% = %.2f%n", 
            MIDTERM_WEIGHT * 100, grade.getMidtermScore() * MIDTERM_WEIGHT);
        System.out.printf("Nilai UAS * %.0f%% = %.2f%n", 
            FINAL_WEIGHT * 100, grade.getFinalScore() * FINAL_WEIGHT);
        System.out.printf("Nilai akhir: %.2f%n", finalScore);
        System.out.println("Nilai akhir anda adalah " + letterGrade);
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
