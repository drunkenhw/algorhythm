import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] square = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            String[] split = scanner.next().split("");
            for (int j = 0; j < split.length; j++) {
                square[i + 1][j + 1] = Integer.parseInt(split[j]);
            }
        }
        int answer = findSquare(square, n, m);
        System.out.println(answer * answer);
    }

    private static int findSquare(int[][] square, int n, int m) {
        int ans = 1;
        for (int size = 1; size <= n && size <= m; size++) {
            for (int i = 1; i + size <= n; ++i) {
                for (int j = 1; j + size <= m; ++j) {
                    if (square[i][j] == square[i + size][j] && square[i][j] == square[i][j + size] && square[i][j] == square[i + size][j + size]) {
                        ans = Math.max(ans, size + 1);
                    }
                }
            }
        }
        return ans;
    }
}