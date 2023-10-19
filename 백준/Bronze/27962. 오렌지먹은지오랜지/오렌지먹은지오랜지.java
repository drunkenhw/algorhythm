import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String string = sc.next();

        for (int i = 1; i < n; i++) {
            String a = string.substring(0, i);
            String b = string.substring(n - i);

            int cnt = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j)) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}