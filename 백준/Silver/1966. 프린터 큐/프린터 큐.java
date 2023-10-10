import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Queue<Print> queue = new LinkedList<>();
            int count = scanner.nextInt();
            int lookIndex = scanner.nextInt();
            for (int j = 0; j < count; j++) {
                queue.add(new Print(j, scanner.nextInt()));
            }
            int result = 1;
            while (!queue.isEmpty()) {
                Print print = queue.poll();
                boolean check = false;
                Iterator<Print> iterator = queue.iterator();
                while (iterator.hasNext()) {
                    Print next = iterator.next();
                    if (print.order < next.order) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    queue.add(print);
                } else {
                    if (print.num == lookIndex) {
                        System.out.println(result);
                    } else {
                        result++;
                    }
                }
            }
        }
    }

    static class Print{
        int num;
        int order;

        public Print(int num, int order) {
            this.num = num;
            this.order = order;
        }
    }
}