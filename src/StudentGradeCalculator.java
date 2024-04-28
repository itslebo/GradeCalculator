import java.util.*;

public class StudentGradeCalculator {

    public static void main(String[] args) throws Exception {
        System.out.println("Please input Grades for all your modules below.");
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[7];
        int sum = 0;
        String[] sub = {"Chem:", "Physics:", "Math:", "Design:", "Python:", "Java", "Calculus"};
        for (int i = 0; i < 7; i++) {
            System.out.println(sub[i]);
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        double average = sum / 7.0; 
        System.out.println("Average marks: " + Math.round(average * 100.0) / 100.0);

        if (average >= 75) {
            System.out.println("Grade: Distinction");
        } else if (average >= 60) {
            System.out.println("Grade: Good");
        } else if (average >= 50) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
