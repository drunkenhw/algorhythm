import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int n = scanner.nextInt();
        Set<String> set = new HashSet<>();
        for (int j = 0; j < i; j++) {
            set.add(scanner.next());
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (set.contains(scanner.next())) {
                count++;
            }
        }
        System.out.println(count);
    }

}
