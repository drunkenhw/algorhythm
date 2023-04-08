
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(scanner.next());
        }
        int count = 0;
        for (String s1 : input) {
            int num = Integer.parseInt(s1);
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
