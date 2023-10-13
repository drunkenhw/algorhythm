import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            int answer = findSum(num);
            System.out.println(answer);
        }
    }

    private static int findSum(int num) {
        int[] dp = new int[10001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 4;
        dp[5] = 5;
        dp[6] = 7;
        for (int i = 7; i <= num; i++) {
            dp[i] = 1 + (i / 2) + dp[i - 3];
        }
        return dp[num];
    }
}

