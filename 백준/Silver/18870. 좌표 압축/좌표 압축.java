import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        int[] split = new int[n];
        for (int i = 0; i < n; i++) {
            split[i] = in.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = split[i];
        }


        Arrays.sort(split);

        Map<Integer, Integer> a = new HashMap<>();
        int b = 0;
        for (int i = 0; i < split.length; i++) {
            if (!a.containsKey(split[i])) {
                a.put(split[i], b);
                b += 1;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(a.get(arr[i]) + " ");
        }
        System.out.println(stringBuilder);
    }
}
