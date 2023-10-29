import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            deque.add(i);
        }

        while (deque.size() >= 1) {
            if (deque.size() < k) {
                break;
            }
            Integer pop = deque.pop();
            deque.add(pop);
            for (int i = 0; i < k - 1; i++) {
                deque.pop();
            }
        }
        System.out.println(deque.pop());
    }
}
