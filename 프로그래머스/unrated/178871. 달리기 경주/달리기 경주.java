import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            rank.put(players[i], i);
        }
        for(String name : callings){
            int myRank = rank.get(name);
            String beforePlayer = players[myRank-1];
            players[myRank - 1] = name;
            players[myRank] = beforePlayer;
            rank.put(name, myRank-1);
            rank.put(beforePlayer, myRank);
        }
        return players;
    }
}