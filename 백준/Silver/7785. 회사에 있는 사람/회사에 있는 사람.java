import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Set<String> name = new HashSet<>();
        for (int j = 0; j < i; j++) {
            String a = scanner.next();
            String b = scanner.next();
            if (b.equals("enter")) {
                name.add(a);
            } else {
                name.remove(a);
            }
        }
        name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

}