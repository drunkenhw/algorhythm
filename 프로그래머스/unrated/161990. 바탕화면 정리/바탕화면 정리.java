class Solution {
    public int[] solution(String[] wallpaper) {
        int top = 51;
    	int left = 51;
    	int bottom = 0;
    	int right = 0;
    	
    	for(int i=0; i<wallpaper.length; i++) {
    		for(int j=0; j<wallpaper[i].length(); j++) {
    			if(wallpaper[i].charAt(j)=='#') {
    				top = Math.min(top, i);
    				left = Math.min(left, j);
    				bottom = Math.max(bottom, i);
    				right = Math.max(right, j);
    			}
    		}
    	}
    	return new int[] {top, left, bottom+1, right+1};    	
    }
}