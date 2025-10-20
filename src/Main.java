import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] failing = AcademicGrades.failingGrades(grades);
        double avg = AcademicGrades.averageGrades(grades);
        System.out.println(Arrays.toString(failing));
        System.out.println(String.format("%.2f", avg));
        int[] rounded = AcademicGrades.roundedGrades(grades);
        System.out.println(Arrays.toString(rounded));
        System.out.println(AcademicGrades.maxroundedGrade(grades));
        System.out.println(AcademicGrades.maxroundedGrade(grades));

    }
}