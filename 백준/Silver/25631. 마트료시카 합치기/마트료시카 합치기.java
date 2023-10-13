import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
            max = Math.max(max, map.get(x));
        }

        System.out.println(max);
    }
}