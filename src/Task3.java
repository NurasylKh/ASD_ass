//program which checks if number composite or prime
//program reads number from concole and gives only answer without number
import java.util.Scanner;

public class Task3 {//method that runs program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//read number check from consolle
        boolean isPrime = isPrime(n);//checks if  number prime
        if (isPrime) {//loop that checks for prime and composite
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
    }
    public static boolean isPrime(int n) {//Checks if a given number is prime
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {//check if number is divisible by any number up to its square root
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}