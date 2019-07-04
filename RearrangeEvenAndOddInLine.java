import java.util.Random;
import java.util.Scanner;

public class RearrangeEvenAndOddInLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of array: ");

        int n = input.nextInt();
        int [] array = new int[n];
        int [] even = new int[n];
        int [] odd = new int[n];

        for (int i = 0; i < n; i++) {

            array[i] = (int) (Math.random() * 20);

        }

        int e=0,o=0;

        for (int i = 0; i < n; i++) {

            if(array[i] % 2 == 0){
                even[e] = array[i];
                e++;
            }else if(array[i] % 2 != 0){
                odd[o] = array[i];
                o++;
            }
        }

        for (int i = 0; i < e; i++) {

            array[i] = even[i];
        }
        for (int i = 0; i < o; i++) {

            array[e+i] = odd[i];
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }


    }

}
