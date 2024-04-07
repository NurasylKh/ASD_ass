//program that calculates the value of "a to the power of n".
//program reads the values of a and n from the console and prints the result.
import java.util.Scanner;

public class Task6 {//method that runs the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//read the values of a from the console
        int n = scanner.nextInt();//read the values of n from the console
        int result = power(a, n);//calculate the value of "a to the power of n" using a loop
        System.out.println(result);//print the result to the console
    }
    public static int power(int a, int n) {//calculates the value of "a to the power of n" using recursion.
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
}