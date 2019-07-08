import java.util.Scanner;

public class SumOf2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int n = input.nextInt();

        int[][] array_first = new int[n][n];
        int[][] array_second = new int[n][n];
        int[][] array_sum = new int[n][n];

        System.out.println("First 2D Array: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array_first[i][j] = (int)(Math.random() * 100);
                System.out.print(array_first[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Second 2D Array: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array_second[i][j] = (int)(Math.random() * 100);
                System.out.print(array_second[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Sum of Array: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

               array_sum[i][j] = array_first[i][j] + array_second[i][j];
                System.out.print(array_sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
