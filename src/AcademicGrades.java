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
}
