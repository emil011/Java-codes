import java.util.Scanner;

public class MultiplicationOfArrayElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = input.nextInt();

        System.out.println("Enter m: ");
        int m = input.nextInt();

        System.out.println("Enter k: ");
        int k = input.nextInt();

        int[][] array_first = new int[n][m];
        int[][] array_second = new int[m][k];
        int[][] array_sum = new int[n][k];

        System.out.println("First 2D Array: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                array_first[i][j] = (int)(Math.random() * 10);
                System.out.print(array_first[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Second 2D Array: ");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < k; j++) {

                array_second[i][j] = (int)(Math.random() * 100);
                System.out.print(array_second[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Multiplication of array elements: ");

        for (int a = 0; a < n; a++) {

            for (int b = 0; b < k; b++) {

                for (int c = 0; c < m; c++) {

                    array_sum[a][b] += array_first[a][c] * array_second[c][b];
                }
                System.out.print(array_sum[a][b] + " ");
            }

            System.out.println();

        }


    }
}
