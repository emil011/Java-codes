import java.util.Scanner;

public class ToeplitzMatrix2DArray {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Rows: ");

        int n = input.nextInt();

        System.out.println("Columns: ");
        
        int m = input.nextInt();


        int[][] array = new int[n][m];

        for(int i=0 ; i < n; i++) {

            for (int j = 0; j < m; j++) {

                array[i][j] = input.nextInt();
            }

        }

        int flag = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                if (array[i][j] != array[i + 1][j + 1]) {

                    flag++;
                }
            }
        }

        if(flag == 0){

            System.out.println("Yes");
        }else{

            System.out.println("No");
        }

    }
}
