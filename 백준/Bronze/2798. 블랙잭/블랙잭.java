
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] s1 = string.split(" ");

        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(scanner.nextInt());
        }
        int search = search(integers, m);
        System.out.println(search);

    }

    private static int search(List<Integer> list, int m) {
        int result = 0;
        int n = list.size();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int temp = list.get(i) + list.get(j) + list.get(k);

                    if (m == temp) {
                        return temp;
                    }
                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
