import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[][] number = new long[65][10];
        for (int i = 0; i <= 9; i++) {
            number[1][i] = 1;
        }

        for (int i = 2; i <= 64; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = j; k <= 9; k++) {
                    number[i][j] += number[i - 1][k];
                }
            }
        }

        int i1 = scanner.nextInt();
        for (int i = 0; i < i1; i++) {
            long a = 0;
            int i2 = scanner.nextInt();

            for (int j = 0; j <= 9; j++) {
                a += number[i2][j];
            }
            System.out.println(a);
        }
    }
}
