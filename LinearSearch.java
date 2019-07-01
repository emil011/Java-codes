import java.util.Random;
import java.util.Scanner;

public class LinearSearch {


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

            int count = 0;

            for (int i = 0; i < arr.length; i++) {

                if(arr[i] == query){

                  count++;

                }
            }

            if(count > 0){

                System.out.println("count: " + count);

            }else{

                System.out.print("Query is not found");
            }


        }

}

