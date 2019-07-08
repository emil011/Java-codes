import java.util.Scanner;

public class Rotate2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");

        int n = input.nextInt();

        int[][] array = new int[n][n];
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = (int)(Math.random() * 100);

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("left or right?:");
        String rotate = input.next();

        if(rotate.equals("right")){

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {


                    rotatedMatrix[j][(n-1) - i] = array[i][j];

                }
            }

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {


                    System.out.print(rotatedMatrix[i][j] + " ");

                }
                System.out.println();
            }

        }else if(rotate.equals("left")){

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {


                    rotatedMatrix[(n - 1 )- j][i] = array[i][j];

                }
            }

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {


                    System.out.print(rotatedMatrix[i][j] + " ");

                }
                System.out.println();
            }

        }


    }
}
