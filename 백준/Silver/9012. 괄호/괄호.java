import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            String s = scanner.next();
            if (vps(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean vps(String s) {
        Deque<String> stack = new LinkedList<>();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            String c = split[i];
            if (c.equals("(")) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
