public class Factorial {
    
    // Recursive function to calculate factorial
    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);  // Recursively call the function
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Calculate and display factorial using the recursive method
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        
        scanner.close();
    }
}
