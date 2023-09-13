import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int j = 1; j < i + 1; j++) {
            queue.add(j);
        }
        int an = 0;
        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                an = queue.peek();
                break;
            }
            queue.poll();
            Integer integer = queue.poll();
            queue.add(integer);
        }
        System.out.println(an);
    }
}

