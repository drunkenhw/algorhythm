import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> house = new PriorityQueue<>(Comparator.comparingInt(o -> (int) o).reversed());
        int rn = scanner.nextInt();
        int[] ab = new int[rn];
        for (int i = 0; i < rn; i++) {
            ab[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < ab.length; i++) {
            house.add(ab[i]);
        }
        if (house.size() == 1) {
            count = house.poll();
        } else {
            while (!house.isEmpty()) {
                Integer first = house.poll();
                int nuun = first - 1;
                if (house.size() >= 1) {
                    Integer second = house.poll();
                    int othernuun = second - 1;
                    if (othernuun != 0) {
                        house.add(othernuun);
                    }
                }
                if (nuun != 0) {
                    house.add(nuun);
                }
                count++;
            }
        }

        if (count > 1440) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }

    }
}
