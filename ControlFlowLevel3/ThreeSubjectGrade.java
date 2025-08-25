import java.util.Scanner;

class ThreeSubjectGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        String grade;
        String remarks;
        if (percentage >= 90) { grade = "A+"; remarks = "Outstanding"; }
        else if (percentage >= 80) { grade = "A"; remarks = "Excellent"; }
        else if (percentage >= 70) { grade = "B+"; remarks = "Very Good"; }
        else if (percentage >= 60) { grade = "B"; remarks = "Good"; }
        else if (percentage >= 50) { grade = "C"; remarks = "Satisfactory"; }
        else if (percentage >= 40) { grade = "D"; remarks = "Pass"; }
        else { grade = "F"; remarks = "Needs Improvement"; }

        System.out.printf("Average: %.2f%%, Grade: %s, Remarks: %s%n",
                percentage, grade, remarks);

        input.close();
    }
}
