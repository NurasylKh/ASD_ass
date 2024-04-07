//program that calculates the factorial of given number using recursion.
//this program reads the number from the console and changes it to factorial.
import java.util.Scanner;

public class Task4 {//The main method that runs the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//reads number
        int factorial = factorial(n);//calculate the factorial using recursion
        System.out.println(factorial);//print the factorial to the console
    }
    public static int factorial(int n) {//calculates the factorial of a given number using recursion
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}