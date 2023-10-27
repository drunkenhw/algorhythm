class Solution {
        public int solution(String s) {
            int answer = 0;
            char first = s.charAt(0);
            int same = 0;
            int other = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (first == c) {
                    same++;
                } else {
                    other++;
                }
                if (same == other) {
                    same = 0;
                    other = 0;
                    answer++;
                    if (i + 1 < s.length()) {
                        first = s.charAt(i + 1);
                    }
                } else if (i == s.length() - 1) {
                    answer++;
                }
            }
            return answer;
        }
    }