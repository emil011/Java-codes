import java.util.Scanner;

public class Simple2DArray8{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of Array:");

        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        int k = 1;

        for (int i = 0; i < arr.length; i++) {

            if(i%2 == 0){

                for (int j = 0; j < arr[i].length; j++) {

                    arr[j][i] = k;
                    k++;
                }
            }
            else{

                for (int j = arr[i].length-1; j >= 0 ; j--) {

                    arr[j][i] = k;
                    k++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
