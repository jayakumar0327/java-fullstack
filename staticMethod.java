public class StaticMethod {

    // Static method to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Two numbers to add
        int number1 = 10;
        int number2 = 20;

        // Calling the static method to add the numbers
        int sum = add(number1, number2);

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}