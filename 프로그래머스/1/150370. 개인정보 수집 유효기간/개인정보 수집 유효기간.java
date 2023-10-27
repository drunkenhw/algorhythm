import java.util.*;

class Solution {
        public int[] solution(String today, String[] terms, String[] privacies) {
            int[] answer = {};
            Map<String, Integer> a = new HashMap<>();
            for (String term : terms) {
                String[] split = term.split(" ");
                String s = split[0];
                int s1 = Integer.parseInt(split[1]);
                a.put(s, s1 * 28);
            }
            Day tod = new Day(today);
            List<Integer> an = new ArrayList<>();
            for (int i = 0; i < privacies.length; i++) {
                String privacy = privacies[i];
                String[] split = privacy.split(" ");
                Day day = new Day(split[0]);
                String s = split[1];
                Integer i1 = a.get(s);
                int days = day.getDays();
                int days1 = tod.getDays();
                if (days1 >= days + i1) {
                    an.add(i+1);
                }
            }

            return an.stream().mapToInt(it -> it).toArray();
        }

        static class Day {
            int year;
            int month;
            int day;

            public Day(String day) {
                String[] split = day.split("\\.");
                this.year = Integer.parseInt(split[0]);
                this.month = Integer.parseInt(split[1]);
                this.day = Integer.parseInt(split[2]);
            }

            int getDays() {
                return (year * 12 * 28) + (month * 28) + day;
            }
        }
    }