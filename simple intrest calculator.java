public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter Principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time (in years) (T): ");
        double time = sc.nextDouble();

        double rate;

        // Determine interest rate using if-else
        if (principal > 10000) {
            rate = 10.0;
        } else if (principal >= 5000) {
            rate = 8.0;
        } else {
            rate = 5.0;
        }

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        [1:16 AM, 7/15/2025] laxmi S: System.out.println("\n--- Simple Interest Details ---");
        System.out.println("Principal: ₹" + principal);
        System.out.println("Time: " + time + " years");
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Simple Interest: ₹" + simpleInterest);

        sc.close();
    }
}
