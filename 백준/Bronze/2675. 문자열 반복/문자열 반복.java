import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
                    StringBuilder stringBuilder = new StringBuilder();

            int i1 = sc.nextInt();
            String s = sc.next();
            for (String string : s.split("")) {
                for (int j = 0; j < i1; j++) {
                    stringBuilder.append(string);
                }
            }
            System.out.println(stringBuilder);
        }
            }
}
