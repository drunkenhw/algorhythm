
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String word = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            result += (c - 96) * Math.pow(31, i);
        }
        System.out.println(result);
    }
}