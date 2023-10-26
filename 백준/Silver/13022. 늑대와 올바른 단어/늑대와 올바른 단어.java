import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        solve(s);
    }

    public enum State {
        START,
        W,
        O,
        L,
        F,
    }

    private static void solve(String str) {
        int wCount = 0;
        int oCount = 0;
        int lCount = 0;
        int fCount = 0;
        State state = State.START;
        for (int i = 0; i < str.length(); i++) {
            if (state == State.START) {
                if (str.charAt(i) != 'w') {
                    System.out.println(0);
                    return;
                }
                wCount++;
                state = State.W;
            } else if (state == State.W) {
                if (str.charAt(i) == 'w') {
                    wCount++;
                } else if (str.charAt(i) == 'o') {
                    state = State.O;
                    oCount++;
                } else {
                    System.out.println(0);
                    return;
                }
            } else if (state == State.O) {
                if (str.charAt(i) == 'o') {
                    oCount++;
                } else if (str.charAt(i) == 'l') {
                    if (wCount != oCount) {
                        System.out.println(0);
                        return;
                    }
                    state = State.L;
                    lCount++;
                } else {
                    System.out.println(0);
                    return;
                }
            } else if (state == State.L) {
                if (str.charAt(i) == 'l') {
                    lCount++;
                } else if (str.charAt(i) == 'f') {
                    if (oCount != lCount) {
                        System.out.println(0);
                        return;
                    }
                    state = State.F;
                    fCount++;
                } else {
                    System.out.println(0);
                    return;
                }
            } else {
                if (str.charAt(i) == 'f') {
                    fCount++;
                } else if (str.charAt(i) == 'w') {
                    if (lCount != fCount) {
                        System.out.println(0);
                        return;
                    }
                    state = State.START;
                    wCount = 0;
                    oCount = 0;
                    lCount = 0;
                    fCount = 0;
                    i -= 1;
                } else {
                    System.out.println(0);
                    return;
                }
            }
        }
        if (wCount != fCount) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}