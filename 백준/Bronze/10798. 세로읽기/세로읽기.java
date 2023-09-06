import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] a = new String[5][15];
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < 15; j++) {
                String[] split = s.split("");
                if (s.length() <= j) {
                    a[i][j] = "";
                } else {
                    a[i][j] = split[j];
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                stringBuilder.append(a[j][i]);
            }
        }
        System.out.println(stringBuilder);
    }
}