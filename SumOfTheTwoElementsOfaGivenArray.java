import java.util.Scanner;

public class SumOfTheTwoElementsOfaGivenArray {
 
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array: ");

        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextInt();

        }

        System.out.println("Enter query: ");

        int query = scan.nextInt();
        int flag = 0;


        for(int i = 0; i < array.length ; i++){

            for(int j = 0; j < i; j++){

                if(array[i] + array[j] == query){

                    System.out.println(array[i] + " + " + array[j] + " = " + query);
                    flag++;

                }
            }
        }

        if(flag == 0){
            System.out.println("Query is not found!");
        }

    }
}

