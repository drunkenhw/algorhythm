import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int b = scanner.nextInt();
        Map<String, Integer> name = new HashMap<>();
        Map<Integer, String> num = new HashMap<>();
        for (int j = 0; j < i; j++) {
            String next = scanner.next();
            name.put(next, j + 1);
            num.put(j + 1, next);
        }
        for (int j = 0; j < b; j++) {
            String next = scanner.next();
            if (name.containsKey(next)) {
                System.out.println(name.get(next));
            } else {
                System.out.println(num.get(Integer.parseInt(next)));
            }
        }
    }

}
