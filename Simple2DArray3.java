import java.util.Scanner;

public class Simple2DArray3{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of Array:");

        int n = scan.nextInt();

        int[][] array = new int[n][n];

        int k = 1;
        for (int i = 0; i < array.length; i++) {

            for(int j = array.length-1;j >= 0;j--){

                array[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }


    }
}
