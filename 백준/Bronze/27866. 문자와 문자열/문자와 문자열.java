import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        String[] split = s.split("");
        System.out.println(split[i-1]);

    }
}
