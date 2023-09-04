import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : alpha.split("")) {
            int i = s.indexOf(string);
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }
}
