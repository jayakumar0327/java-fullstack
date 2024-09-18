import java.util.Scanner;

public class EmployeeEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        // Check if the employee is eligible to work
        if (age > 90) {
            System.out.println("Employee " + name + " (ID: " + id + ") is not eligible to work in the company.");
        } else {
            System.out.println("Employee " + name + " (ID: " + id + ") is eligible to work in the company.");
        }

        // Close the scanner
        scanner.close();
    }
}