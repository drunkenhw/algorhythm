import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] apart = new int[15][15];
        for (int i = 0; i < 15; i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            int floor = scanner.nextInt();
            int ho = scanner.nextInt();
            System.out.println(apart[floor][ho]);
        }
    }
}
