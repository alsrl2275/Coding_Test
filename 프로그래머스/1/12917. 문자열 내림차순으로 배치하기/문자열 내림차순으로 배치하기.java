import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Character[] chars = new Character[s.length()];
        for(int i = 0; i < s.length(); i++) {
        	chars[i] = s.charAt(i);
        }
        
        Arrays.sort(chars, Collections.reverseOrder());
        
        for(char c : chars) {
        	sb.append(c);
        }
        return sb.toString();
    }
}