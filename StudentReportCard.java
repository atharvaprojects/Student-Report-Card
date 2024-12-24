import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int numSubjects = sc.nextInt();

        // Array to store marks
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (double) totalMarks / numSubjects;

        // Determine grade
        String grade = calculateGrade(percentage);

        // Build the report card
        StringBuilder reportCard = new StringBuilder();
        reportCard.append("\n----- Student Report Card -----\n");
        reportCard.append("Name: ").append(studentName).append("\n");
        reportCard.append("Total Marks: ").append(totalMarks).append("\n");
        reportCard.append("Percentage: ").append(String.format("%.2f", percentage)).append("%\n");
        reportCard.append("Grade: ").append(grade).append("\n");

        // Add bit manipulation feature for fun
        reportCard.append("\nFun Fact: Your total marks (")
                .append(totalMarks)
                .append(") are ")
                .append((totalMarks & 1) == 0 ? "even" : "odd")
                .append("!\n");

        // Display report card
        System.out.println(reportCard);

        sc.close();
    }

    // Function to calculate grade based on percentage
    private static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
