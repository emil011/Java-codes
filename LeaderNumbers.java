import java.util.Scanner;

public class LeaderNumbers{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array: ");

        int n = scan.nextInt();
        int [] array = new int[n];

        System.out.println("Enter the elements of array");

        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextInt();

        }

        System.out.println("Leader numbers: ");

        for (int i = 0; i < array.length; i++){

            int j;

            for (j = i + 1; j < array.length; j++) {

                if(array[i] <= array[j]){

                    break;

                }

            }

            if(j == array.length){

                System.out.print(array[i] + " ");
            }


        }

    }
    
}
