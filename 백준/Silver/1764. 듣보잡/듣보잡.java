import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), 1);
        }
        for (int i = 0; i < m; i++) {
            String name = scanner.next();
            map.put(name, map.getOrDefault(name, 0) + 1);
            if (map.get(name) == 2) {
                list.add(name);
            }
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        sb.append(list.size() + "\n");
        for (String s : list) {
            sb.append(s + "\n");
        }
        System.out.print(sb);
    }
}