import java.util.Random;
import java.util.Scanner;

public class SecondLargestNumberOfArray{


    public static void main(String[] args) {

        Random rd = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, Enter size of array: ");

        int n =  scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {


            arr[i] = rd.nextInt(20);
            System.out.println(arr[i]);

        }


        int largest = arr[0], secondLargest = arr[0], pos = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
                pos = i;

            }
        }


        System.out.print("Second largest number is: " + secondLargest + " Position " + pos);


    }

}
