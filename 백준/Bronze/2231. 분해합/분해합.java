
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = 0;
        for (int j = 0; j < i; j++) {
            int saengsungja = saengsungja(String.valueOf(j));
            if (saengsungja == i) {
                result = j;
                break;
            }
        }
        System.out.println(result);

    }

    private static int saengsungja(String num) {
        int nuum = Integer.parseInt(num);
        for (String s : num.split("")) {
            nuum += Integer.parseInt(s);
        }
        return nuum;
    }
}
