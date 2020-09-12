import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        // REPLACE WITH YOUR CODE HERE
        double m = 1;
        while (Math.abs(m - Math.sqrt(x)) > 0.00001) {
            m = (m + x/m) / 2;
        }
        return m;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        // REPLACE WITH YOUR CODE HERE
        double answer = 1;
        for (int i = x; i > 0; i--) {
            answer *= i;
        }
        return answer;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        // REPLACE WITH YOUR CODE HERE
        double e = 0;
        int i = 0;
        while (Math.abs(Math.E - e) > 0.00000000001) {
            e += 1/factorial(i);
            i++;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select Program (babylonian, factorial, calculateE)");
        String menu = scan.nextLine().toUpperCase();
        switch (menu) {
            case "BABYLONIAN":
                System.out.println("Enter a value to find sqrt of:");
                if (scan.hasNextDouble()) {
                    System.out.println("The square root is " + babylonian(scan.nextDouble()));
                } else {
                    System.out.println("Invalid entry.");
                }
                break;
            case "FACTORIAL":
                System.out.println("Enter a value to find factorial of:");
                if (scan.hasNextInt()) {
                    System.out.println("The factorial is " + factorial(scan.nextInt()));
                } else {
                    System.out.println("Invalid Entry.");
                }
                break;
            case "CALCULATEE":
                System.out.println("E is " + calculateE());
                break;
            default:
                System.out.println("Invalid menu entry.");
        }
        

        scan.close();
    }
}
