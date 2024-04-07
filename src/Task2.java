//its a task that calculates avarage of array
//in program it reads number of elements in array and elements
//and then prints average number
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {//method that runs the program
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();//the number of elements in array

        int[] arr = new int[n];//creates array in some size

        for (int i = 0; i < n; i++) {// read elements of array from the console
            arr[i] = scanner.nextInt();
        }
        double average = findAvg(arr);//calculates average number and declares function

        System.out.println(average);
    }
    public static double findAvg(int[] arr) {//calculates to average
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;//calculates average by dividing the sum by numbers
        return average;//returns result
    }
}