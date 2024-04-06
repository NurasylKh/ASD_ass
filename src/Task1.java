//this is 1task which should read an array and then get minimum number in array
import java.util.Scanner;
public class Task1 {//Task1 method main method that runs program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//I use to input values for n
        int[] arr = new int[n];//creates array

        for (int i = 0; i < n; i++) {// read elements of array from the console
            arr[i] = scanner.nextInt();
        }

        System.out.println(Min(arr));

    }
    public static int Min(int[] arr) {//this function finds minimum element in an array
        int minVal = arr[0];//thinks first element is minimum
        for (int i = 1; i < arr.length; i++) {//loop
            if (arr[i] < minVal) {//if we find smaller number we uptate it
                minVal = arr[i];
            }
        }
        return minVal;//returns minvalue
    }
}