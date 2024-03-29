class Solution {
    boolean solution(String s) {
    	String lowercase = s.toLowerCase();
        boolean answer = true;
        
        int countp = 0;
        int county = 0;
        
        for(int i = 0; i < lowercase.length(); i++) {
        	char c = lowercase.charAt(i);
        	if(c == 'p') {
        		countp++;
        	} else if(c == 'y') {
        		county++;
        	}
        }
        
        if(countp == county) {
        	answer = true;
        } else {
        	answer = false;
        }

        return answer;
    }
}