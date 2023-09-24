import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String an = scanner.nextLine();
        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }
        String string = stringBuilder.toString();
        if (string.contains(an)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
