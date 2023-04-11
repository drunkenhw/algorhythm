
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        int i = Integer.parseInt(s[0]);
        int i2 = Integer.parseInt(s[1]);

        int gcd = gcd(i, i2);
        System.out.println(gcd);
        System.out.println(i * i2 / gcd);

    }

    private static int gcd(int a, int b) {
        int tmp, n;

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}
