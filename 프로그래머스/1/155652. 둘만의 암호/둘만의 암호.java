import java.util.*;

class Solution {
        public String solution(String s, String skip, int index) {
            String answer = "";
            List<String> alphabet = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
            for (int i = 0; i < skip.length(); i++) {
                String index1 = String.valueOf(skip.charAt(i));
                alphabet.remove(index1);
            }

            for (int i = 0; i < s.length(); i++) {
                String at = String.valueOf(s.charAt(i));
                int i1 = alphabet.indexOf(at);
                int i2 = i1 + index;
                int size = alphabet.size();
                while (true) {
                    if (i2 >= size) {
                        i2 -= size;
                    } else {
                        break;
                    }
                }
                String s1 = alphabet.get(i2);
                answer += s1;
            }
            return answer;
        }
    }