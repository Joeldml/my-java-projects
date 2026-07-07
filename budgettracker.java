import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double budget, expense, totalSpent = 0;
        int choice;

        System.out.print("Enter your monthly budget: ");
        budget = input.nextDouble();

        do {
            System.out.println("\n===== Budget Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Budget Status");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter expense amount: ");
                    expense = input.nextDouble();

                    totalSpent += expense;
                    System.out.println("Expense added successfully.");
                    break;

                case 2:
                    double remaining = budget - totalSpent;

                    System.out.println("\n----- Budget Status -----");
                    System.out.println("Budget: ₦" + budget);
                    System.out.println("Total Spent: ₦" + totalSpent);
                    System.out.println("Remaining Balance: ₦" + remaining);

                    if (remaining < 0) {
                        System.out.println("Warning: You have exceeded your budget!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Budget Tracker.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 3);

        input.close();
    }
}