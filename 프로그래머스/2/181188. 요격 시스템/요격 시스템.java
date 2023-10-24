import java.util.*;

class Solution {
        public int solution(int[][] targets) {
            int answer = 1;

            List<Line> list = new ArrayList<>();
            for (int i = 0; i < targets.length; i++) {
                int start = targets[i][0];
                int end = targets[i][1];
                Line line = new Line(start, end);
                list.add(line);
            }
            Collections.sort(list);
            int size = list.size();
            int a = -1;
            for (int i = 0; i < size; i++) {
                Line line = list.get(i);
                if (a == -1) {
                    a = line.end;
                    continue;
                }
                if (line.start < a && line.end >= a) {
                    continue;
                } else {
                    a = line.end;
                    answer++;
                }
            }
            return answer;
        }

        static class Line implements Comparable<Line> {
            int start;
            int end;

            public Line(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public int compareTo(Line o) {
                int i = this.end - o.end;
                if (i == 0) {
                    return this.start - o.start;
                }
                return i;
            }
        }
    }