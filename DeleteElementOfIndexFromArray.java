import java.util.Random;
import java.util.Scanner;

public class DeleteElementOfIndexFromArray{


    public static void main(String[] args) {

        Random rd = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.print("Please, Enter size of array: ");

        int n =  scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = rd.nextInt(50);

            System.out.println(arr[i]);

        }

        System.out.print("Remove element of index: ");

        int query = scan.nextInt();


        for (int i = 0; i < arr.length; i++) {

            if(i == query){

                for(int j = i; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1];
                }

            }
        }

        for(int i = 0; i < arr.length - 1; i++){

            System.out.print(" " + arr[i]);

        }


    }

}
