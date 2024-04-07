//program that calculates GCD of two numbers using recursion
//program reads the values of a and b from the console and prints their GCD
import java.util.Scanner;

public class Task10 {//method that runs the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//read the values of a from the console
        int b = scanner.nextInt();//read the values of b from the console
        int gcd = gcd(a, b);//calculate the GCD using recursion and the Euclidean algorithm
        System.out.println(gcd);//print gcd
    }
    public static int gcd(int a, int b) {//calculates GCD of two numbers using recursion
        if (b == 0) {//if b is 0, the GCD is a
            return a;
        }
        return gcd(b, a % b);//calculate the GCD by calling the gcd method with updated values of a and b
    }
}