import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[15][15];

        for(int i = 0; i < 15; i++) {
            a[i][1] = 1;	
            a[0][i] = i;	
        }


        for(int i = 1; i < 15; i ++) {
            for(int j = 2; j < 15; j++) {	
                a[i][j] = a[i][j - 1] + a[i - 1][j];
            }
        }

        int count = scanner.nextInt();

        for(int i = 0; i < count; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(a[k][n]);
        }
    }
}
