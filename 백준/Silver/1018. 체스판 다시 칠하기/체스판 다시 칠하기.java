
import java.util.Scanner;

public class Main {

    public static boolean[][] chessColor;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        chessColor = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = in.next();
            for (int j = 0; j < m; j++) {
                chessColor[i][j] = str.charAt(j) == 'W';
            }
        }

        int chessRow = n - 7;
        int chessColumn = m - 7;

        for (int i = 0; i < chessRow; i++) {
            for (int j = 0; j < chessColumn; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }


    public static void find(int x, int y) {
        int count = 0;

        boolean firstColor = chessColor[x][y];
        for (int i = x; i <  x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (chessColor[i][j] != firstColor) {
                    count++;
                }
                firstColor = !firstColor;
            }
            firstColor = !firstColor;
        }
        count = Math.min(count, 64 - count);
        
        min = Math.min(min, count);
    }
}
