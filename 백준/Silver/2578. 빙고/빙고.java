import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static boolean[][] bingo = new boolean[5][5];
    static Map<Integer, Point> pointMap = new HashMap<>();
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            String[] split = s.split(" ");
            for (int j = 0; j < split.length; j++) {
                pointMap.put(Integer.parseInt(split[j]), new Point(i, j));
            }
        }
        for (int i = 0; i < 25; i++) {
            int i1 = scanner.nextInt();
            Point point = pointMap.get(i1);
            bingo[point.x][point.y] = true;
            garo();
            sero();
            daegak();
            bandae();
            if (count >= 3) {
                System.out.println(i + 1);
                return;
            }
            count = 0;
        }

    }

    public static void garo() {
        for (int i = 0; i < 5; i++) {
            int cc = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j])
                    cc++;
            }
            if (cc == 5) {
                count++;
            }
        }
    }

    public static void sero() {
        for (int i = 0; i < 5; i++) {
            int cc = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i])
                    cc++;
            }
            if (cc == 5) {
                count++;
            }
        }
    }

    public static void daegak() {
        int cc = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i])
                cc++;
        }
        if (cc == 5) {
            count++;
        }
    }

    public static void bandae() {
        int cc = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i])
                cc++;
        }
        if (cc == 5) {
            count++;
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
