import java.util.Scanner;

public class Main {
    static int priceMap[][];
    static int n;
    static int price = Integer.MAX_VALUE;
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static boolean flowerMap[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        priceMap = new int[n + 1][n + 1];
        flowerMap = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String[] split = scanner.nextLine().split(" ");
            for (int j = 1; j <= n; j++) {
                priceMap[i][j] = Integer.parseInt(split[j - 1]);
            }
        }
        getPrice(0, 0);
        System.out.println(price);
    }

    private static void getPrice(int count, int total) {
        if (count == 3) {
            price = Math.min(price, total);
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (isPossible(i, j)) {
                    int tempTotal = calc(i, j);
                    init(i, j, true);
                    getPrice(count + 1, total + tempTotal);
                    init(i, j, false);
                }
            }
        }

    }

    private static boolean isPossible(int x, int y) {
        if (flowerMap[x][y] || x < 1 || y < 1 || x > n || y > n) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 1 || ny < 1 || nx > n || ny > n || flowerMap[nx][ny]) {
                return false;
            }
        }
        return true;
    }

    private static int calc(int x, int y) {
        int sum = priceMap[x][y];
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            sum += priceMap[nx][ny];
        }
        return sum;
    }

    private static void init(int x, int y, boolean flag) {
        flowerMap[x][y] = flag;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            flowerMap[nx][ny] = flag;
        }
    }
}
