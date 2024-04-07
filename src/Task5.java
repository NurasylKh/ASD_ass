//program that calculates the n-th element of the Fibonacci sequence using recursion.
//program reads the value of n from the console and prints the corresponding Fibonacci number
import java.util.Scanner;

public class Task5 {//method that runs the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//read the value of n from the console
        int fibonacci = fibonacci(n);//calculate the n-th Fibonacci number using recursion
        System.out.println(fibonacci);
    }
    public static int fibonacci(int n) {//Calculates the n-th element of the Fibonacci sequence using recursion.
        if (n == 0 || n == 1) {//if n is 0 or 1, the Fibonacci number is n
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}