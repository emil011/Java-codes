import java.util.Scanner;

public class Simple2DArray2{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of Array:");

        int n = scan.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n; j++) {

                array[i][j] = i;


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
