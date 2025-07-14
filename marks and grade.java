public class MarksAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking marks input for 5 subjects
        System.out.println("Enter marks for 5 subjects (each out of 100):");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        // Calculate total and average
        int total = s1 + s2 + s3 + s4 + s5;
        double average = total / 5.0;

        // Display total and average
        System.out.println("\nTotal Marks: " + total + " / 500");
        System.out.println("Average: " + average + "%");

        // Determine grade
        char grade;
        if (average > 90) {
            grade = 'E'; // Ex (Excellent)
            System.out.println("Grade: Ex");
        } else if (average > 80) {
            grade = 'A';
            System.out.println("Grade: A");
        } else if (average > 60) {
            grade = 'B';
            System.out.println("Grade: B");
        } else if (average >= 40) {
            grade = 'C';
            System.out.println("Grade: C");
        } else {
            grade = 'F';
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
