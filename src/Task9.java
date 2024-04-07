//program that calculates the binomial coefficient using recursion.
//program reads the values of n and k from the console and prints the binomial coefficient.
import java.util.Scanner;

public class Task9 {//method that runs the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//read the values of n from the console
        int k = scanner.nextInt();// read the values of k from the console
        int binomialCoefficient = binomialCoefficient(n, k);// calculate the binomial coefficient using recursion
        System.out.println(binomialCoefficient);//print the binomial coefficient to the console
    }
    public static int binomialCoefficient(int n, int k) {//calculates the binomial coefficient using recursion.
        if (k == 0 || k == n) {//if k is 0 or k is equal to n, the binomial coefficient is 1
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);//calculate the binomial coefficient using the formula C(n, k)
    }
}