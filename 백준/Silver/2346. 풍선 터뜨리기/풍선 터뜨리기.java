import java.util.*;

class Main {
    static class Balloon {
        int idx;
        int element;

        public Balloon(int idx, int element) {
            this.idx = idx;
            this.element = element;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Deque<Balloon> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(new Balloon(i, scanner.nextInt()));
        }

        int prev = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (deque.size() > 1) {
            Balloon balloon = (prev >= 0) ? deque.pollFirst() : deque.pollLast();
            for (int i = 0; i < Math.abs(balloon.element) - 1; i++) {
                if (balloon.element > 0) {
                    deque.addLast(deque.pollFirst());
                } else {
                    deque.addFirst(deque.pollLast());
                }
            }

            prev = balloon.element;
            stringBuilder.append(balloon.idx).append(" ");
        }
        stringBuilder.append(deque.poll().idx);

        System.out.println(stringBuilder);
    }
}