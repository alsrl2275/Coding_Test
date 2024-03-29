import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n); // 숫자 n을 문자열로 변환
        int length = str.length(); // 문자열의 길이, 즉 n의 자릿수를 구함
        
        for(int i = 0; i < length; i++) {
        	answer += Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}