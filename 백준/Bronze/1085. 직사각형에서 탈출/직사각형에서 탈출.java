
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputs = input.split(" ");

        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int w = Integer.parseInt(inputs[2]);
        int h = Integer.parseInt(inputs[3]);

        int xToDistance = w - x;
        xToDistance = Math.min(x, xToDistance);
        int yToDistance = h - y;
        yToDistance = Math.min(y, yToDistance);
        if (xToDistance > yToDistance) {
            System.out.println(yToDistance);
        } else {
            System.out.println(xToDistance);
        }
    }
}
