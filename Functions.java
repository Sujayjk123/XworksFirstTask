public class Functions {

    
    public static int add(int a, int b) {
        return a + b;
    }

   
    public static int subtract(int a, int b) {
        return a - b;
    }

    
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    
    public static int largestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Invoking the functions
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Subtraction: " + subtract(10, 4));
        System.out.println("Multiplication: " + multiply(7, 2));
        System.out.println("Division: " + divide(15, 3));

        System.out.println("Is 10 even? " + isEven(10));

        System.out.println("Factorial of 5: " + factorial(5));

        String str = "Hello";
        System.out.println("Reversed string: " + reverseString(str));

        System.out.println("Largest of 3, 5, and 1: " + largestOfThree(3, 5, 1));

        System.out.println("Is 17 a prime number? " + isPrime(17));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sumArray(arr));
    }
}
 
