import java.util.Scanner;

public class EvenElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Array size: ");

        int n = input.nextInt();

        int [][] array = new int[n][n];


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = (int)(Math.random() * 100);
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Even elements: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if(array[i][j] % 2 == 0){

                    System.out.print(array[i][j] + " ");
                }
            }

            System.out.println();
        }


    }
}
