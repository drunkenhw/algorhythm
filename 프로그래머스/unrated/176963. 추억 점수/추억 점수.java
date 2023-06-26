class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i =0; i< photo.length; i++){
            String[] people =photo[i];
            answer[i] = calculate(people, name, yearning);
        }
        return answer;
    }
    
    public int calculate(String[] people, String[] name, int[] yearning){
        int score = 0;
        for(int i =0; i< name.length; i++){
            String realName = name[i];
            for(String person:people){
                if(realName.equals(person)){
                    score+=yearning[i];
                }
            }
        }
        return score;
    }
}