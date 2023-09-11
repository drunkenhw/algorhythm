import java.util.*;

class Main {

    private static final Deque<Integer> stack = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            String command = scanner.next();
            if (command.equals("1")) {
                stack.addFirst(Integer.parseInt(scanner.next()));
            } else if (command.equals("2")) {
                stringBuilder.append(stack.isEmpty() ? -1 : stack.pollFirst()).append("\n");
            } else if (command.equals("3")) {
                stringBuilder.append(stack.size()).append("\n");
            } else if (command.equals("4")) {
                stringBuilder.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("5")) {
                stringBuilder.append(stack.isEmpty() ? -1 : stack.getFirst()).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}