import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int n = input.nextInt();

        int[][] array = new int[n][n];

        int k = 1, minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1;

        while(k <= n * n){

            for(int i = minCol; i <= maxCol; i++) {
                array[minRow][i]=k++;
            }

            for(int j = minRow + 1;j <= maxRow; j++) {
                array[j][maxCol]=k++;
            }

            for(int i = maxCol - 1; i >= minCol; i--) {
                array[maxRow][i]=k++;
            }

            for(int j = maxRow - 1; j >= minRow + 1; j--) {
                array[j][minCol]=k++;
            }

            minCol++;
            maxCol--;
            minRow++;
            maxRow--;
        }

        System.out.println("The Spiral Matrix is:");

        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array.length; j++) {

                System.out.print(array[i][j]+ " ");

            }
            System.out.println();
        }



    }
}
