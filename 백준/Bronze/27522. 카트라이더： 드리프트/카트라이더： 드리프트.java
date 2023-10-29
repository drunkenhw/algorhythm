import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cart> cartList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            String next = scanner.nextLine();
            String[] split = next.split(" ");
            String bucket = split[0];
            String count = split[1];
            cartList.add(new Cart(bucket, count));
        }
        Collections.sort(cartList);

        int blue = 0;
        int red = 0;
        for (int i = 0; i < 8; i++) {
            Cart cart = cartList.get(i);
            int score = getScore(i);
            if (cart.team.equals("B")) {
                blue += score;
            } else {
                red += score;
            }
        }
        if (blue > red) {
            System.out.println("Blue");
        } else if (blue < red) {
            System.out.println("Red");
        } else {
            Cart cart = cartList.get(0);
            String team = cart.team;
            if (team.equals("B")) {
                System.out.println("Blue");
            } else {
                System.out.println("Red");
            }
        }
    }

    private static int getScore(int i) {
        switch (i) {
            case 0:
                return 10;
            case 1:
                return 8;
            case 2:
                return 6;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
                return 1;
        }
        return 0;
    }

    static class Cart implements Comparable<Cart> {
        int time;
        String team;

        public Cart(String time, String team) {
            this.time = Integer.parseInt(time.replace(":", ""));
            this.team = team;
        }

        @Override
        public int compareTo(Cart o) {
            return this.time - o.time;
        }
    }
}
