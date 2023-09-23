import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String start = st.nextToken();
        String end = st.nextToken();
        String quit = st.nextToken();

        Map<String, Boolean> student = new HashMap<>();
        String timeAndNick;
        while ((timeAndNick = br.readLine()) != null) {
            String[] timess = timeAndNick.split(" ");
            String attendTime = timess[0];
            String nick = timess[1];
            if (start.compareTo(attendTime) >= 0) {
                student.put(nick, false);
            } else if (end.compareTo(attendTime) <= 0 && quit.compareTo(attendTime) >= 0) {
                if (student.containsKey(nick)) {
                    student.put(nick, true);
                }
            }
        }
        System.out.println(student.values().stream().filter(it -> it).collect(Collectors.toList()).size());
    }
}
