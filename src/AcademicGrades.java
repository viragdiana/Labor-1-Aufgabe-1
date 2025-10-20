public class AcademicGrades {
    private static void validateGrades(int[] grades){
        if(grades == null){
            throw new IllegalArgumentException("Grades array cannot be null");
        }
        for (int grade : grades) {
            if(grade < 0 || grade > 100){
                throw new IllegalArgumentException("Grade must be between 0 and 100");
            }
        }
    }
    public static int[] failingGrades(int[] grades){
        validateGrades(grades);
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }
            int[] failing = new int[count];
            int idx = 0;
            for(int grade: grades){
                if(grade < 40){
                    failing[idx] = grade;
                    idx++;
                }
            }
        return failing;
    }
    public static double averageGrades(int[] grades){
        validateGrades(grades);
        int sum = 0;
        for(int grade: grades){
            sum += grade;
        }
        double avg = (double) sum / grades.length;
        return avg;
    }
    public static int[] roundedGrades(int[] grades) {
        validateGrades(grades);
        int[] rounded = new int[grades.length];
        int i = 0;
        for (int grade : grades) {
            if (grade < 38) {
                rounded[i] = grade;
            } else {
                int remainder = grade % 5;
                int difference = 5 - remainder;
                if (difference < 3) {
                    rounded[i] = grade + difference;
                } else {
                    rounded[i] = grade;
                }
            }
            i++;
        }
        return rounded;
    }
    public static int maxroundedGrade(int[] grades){
        validateGrades(grades);
        int[] rounded = roundedGrades(grades);
        int max = rounded[0];
        for (int grade : rounded){
            if (grade > max) {
                max = grade;
            }
        }
        return max;

    }
    }

