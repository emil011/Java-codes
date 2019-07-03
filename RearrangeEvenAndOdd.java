import java.util.Random;
import java.util.Scanner;

public class JavaTask6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array: ");

        int n = scan.nextInt();
        int [] array = new int[n];

        Random rnd = new Random();
        int min = 1, max = 20;


        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt((max - min) + 1) + min;

        }

        int l = 0,r= array.length - 1;

        while(l < r) {

            if(array[l] % 2==0) {

                l++;

            } else{

                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                r--;

            }

        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }

}
