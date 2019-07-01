import java.util.Random;
import java.util.Scanner;

public class DeleteElemenFromArray{


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

        System.out.print("Please, Enter a query: ");

        int query = scan.nextInt();


        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == query){

                for(int j = i; j < arr.length - 1; j++){

                    arr[j] = arr[j+1];
                }
                break;

            }
        }

        for(int i = 0; i < arr.length - 1; i++){

            System.out.print(" " + arr[i]);

        }


    }

}
