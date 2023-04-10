
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            if (vpfflaemfha(input)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean vpfflaemfha(String input) {
        int length = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            String[] split = input.split("");
            if (!split[i].equals(split[length])) {
                return false;
            }
            length--;
        }
        return true;
    }
}