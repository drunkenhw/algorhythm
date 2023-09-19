import java.util.*;


class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rn = scanner.nextInt();
        boolean[] block = new boolean[rn - 1];

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x < y) {
                for (int j = x - 1; j < y - 1; j++) {
                    block[j] = true;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < block.length; i++) {
            if (!block[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
