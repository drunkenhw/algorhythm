class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "";
            int card1Index = 0;
            int card2Index = 0;
            for (String word : goal) {
                if (cards1.length >card1Index  && word.equals(cards1[card1Index])) {
                    card1Index++;
                } else if (cards2.length > card2Index && word.equals(cards2[card2Index])) {
                    card2Index++;
                } else {
                    return "No";
                } 
            }
            return "Yes";
        }

    }