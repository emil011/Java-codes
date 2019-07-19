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

            System.out.print(arr[i] + " ");

        }
        System.out.println();

        System.out.print("Remove element of index: ");

        int query = scan.nextInt();

        if(query < arr.length){

            for (int i = query; i < arr.length - 1; i++) {

                arr[i] = arr[i + 1];
            }
        }else{
            System.out.println("Wrong Index!");
            return;
        }


        for(int i = 0; i < arr.length - 1; i++){

            System.out.print(arr[i] + " ");

        }

    }

}
