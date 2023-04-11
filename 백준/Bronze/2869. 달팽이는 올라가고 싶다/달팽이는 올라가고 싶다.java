
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int v = Integer.parseInt(s1[2]);

        int x = (v - b) / (a - b);
        if ((v - b) % (a - b) != 0) {
            x += 1;
        }
        System.out.println(x);
    }

}
