import java.util.Scanner;

public class MoveZeroToEndOfArray{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of array: ");

        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 20);

        }

        for (int i = 0; i < array.length; i++){

            for (int j = i + 1; j < array.length; j++) {

                if(array[i]==0 && array[j]!=0){

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
            System.out.print(array[i] + " ");
        }
     
    }
}
