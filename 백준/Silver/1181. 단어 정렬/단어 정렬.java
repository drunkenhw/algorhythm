
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Set<String> words = new LinkedHashSet<>(i);
        for (int j = 0; j < i; j++) {
            words.add(scanner.next());
        }
        final Comparator<String> condition = (p1, p2) -> {
            if (p1.length() == p2.length()) {
                return p1.compareTo(p2);
            } else {
                return p1.length() - p2.length();
            }
        };

        List<String> sort = words.stream()
                .sorted(condition).collect(Collectors.toList());

        for (String word : sort) {
            System.out.println(word);
        }
    }
}