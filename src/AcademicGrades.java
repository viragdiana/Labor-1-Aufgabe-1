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
}
