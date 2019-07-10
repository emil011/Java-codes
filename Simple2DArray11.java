import java.util.Scanner;

public class Simple2DArray11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");

        int n = scan.nextInt();

        int arr[][] = new int[n][n] ;
        int  rows,columns,counter = 1;

       for (int i = 0; i < n; i++) {
            rows = i;
            columns = 0;
            while (rows >= 0) {
                arr[rows][columns] = counter;
                counter++;
                columns++;
                rows--;
            }
        }

        for (int i = 1; i < n; i++) {
            columns = i;
            rows = n - 1;

            while (rows >= i) {
                arr[rows][columns] = counter;
                counter++;
                columns++;
                rows--;
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ") ;
            }
            System.out.println() ;
        }


    }

}
