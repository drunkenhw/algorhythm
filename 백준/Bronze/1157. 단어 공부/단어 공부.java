import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.next();
        next = next.toUpperCase();
        int[] a = new int[26];
        int max = 0;
        for (char c : next.toCharArray()) {
            int i = c - 'A';
            int i1 = a[i];
            a[i] = i1 + 1;
            if (max < a[i]) {
                max = a[i];
            }
        }

        int count = 0;
        char answer = 0;
        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                count++;
                answer = (char) (i + 'A');
            }
        }
        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}
