import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String s = scanner.nextLine();

        String[] split = s.split(" ");
        Set<String> a = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].endsWith("Cheese")) {
                a.add(split[i]);
                if (a.size() >= 4) {
                    break;
                }
            }
        }

        int size = a.size();
        if (size >= 4) {
            System.out.println("yummy");
        } else {
            System.out.println("sad");
        }
    }
}