import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (true) {
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int[] firstArr = new int[n];
            for (int i = 0; i < n; i++) {
                int i1 = scanner.nextInt();
                firstArr[i] = i1;
            }
            int second = scanner.nextInt();
            int[] secondArr = new int[second];
            for (int i = 0; i < second; i++) {
                int i1 = scanner.nextInt();
                secondArr[i] = i1;
            }
            answer(firstArr, secondArr);
        }
    }

    private static void answer(int[] firstArr, int[] secondArr) {
        List<Integer> dup = new ArrayList<>();
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[j]) {
                    dup.add(firstArr[i]);
                }
            }
        }
        dup.add(Integer.MAX_VALUE);
        int size = dup.size();
        int sum = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < size; i++) {
            int firstSum = 0;
            int secondSum = 0;
            Integer dupNum = dup.get(i);
            for (int j = firstIndex; j < firstArr.length; j++) {
                if (dupNum == firstArr[j]) {
                    firstIndex = j + 1;
                    break;
                }
                firstSum += firstArr[j];
            }

            for (int j = secondIndex; j < secondArr.length; j++) {
                if (dupNum == secondArr[j]) {
                    secondIndex = j + 1;
                    break;
                }
                secondSum += secondArr[j];
            }
            sum += Math.max(firstSum, secondSum);
            if (dupNum != Integer.MAX_VALUE) {
                sum += dupNum;
            }
        }
        System.out.println(sum);
    }
}
