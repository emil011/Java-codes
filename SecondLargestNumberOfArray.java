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
            System.out.print(arr[i] + " ");

        }
        System.out.println();


        int largest = arr[0], secondlargest = 0, pos = -1;


        for(int i = 1; i < arr.length; i++){

            if(largest < arr[i]){

                largest = arr[i];

            }
        }

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != largest && (pos == -1 || arr[i] > secondlargest)){

                secondlargest = arr[i];
                pos = i;

            }
        }



        System.out.print("Second largest number is: " + secondlargest + " Position " + pos);


    }

}
