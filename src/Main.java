import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] failing = AcademicGrades.failingGrades(grades);
        System.out.println(Arrays.toString(failing));

    }
}