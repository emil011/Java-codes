import java.util.Scanner;

public class Power2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        
        int n = input.nextInt();

        int k = 1;

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = k;
                k++;
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
    }
}
