import java.util.Scanner;

public class SumOfTheTwoElementsOfaGivenArray {

 public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array: ");

        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {

           array[i] = scan.nextInt();

        }

        System.out.println("Enter query: ");

        int query = scan.nextInt();


        for(int i = 0; i < array.length / 2; i++){

            for(int j = 0; j < array.length; j++){

                if(array[i] + array[j] == query){

                    System.out.println(array[i] + " + " + array[j] + " = " + query);

                }
            }
        }



    }
}

