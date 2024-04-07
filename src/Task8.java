//program that checks whether a string consists only of digits using recursion.
//program reads the string from the console and prints whether it consists only of digits.
import java.util.Scanner;

public class Task8 {//method that runs the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();//read the string from the console
        boolean isAllDigits = isDigits(s, 0);//check if the string consists only of digits using recursion
        if (isAllDigits) {//Prints whether the string consists only of digits to the console
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isDigits(String s, int index) {//Checks whether a string consists only of digits using recursion.
        if (index == s.length()) {//if the index is equal to the length of the string, the string consists only of digits
            return true;
        }
        char c = s.charAt(index);//check whether the current character is a digit, and then call the isAllDigits method with the updated index
        if (! Character.isDigit(c)) {
            return false;
        }
        return isDigits(s, index + 1);
    }
}