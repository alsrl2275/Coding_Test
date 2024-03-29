class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1;
        
        if(s.charAt(0) == '-') { // 문자열 첫번쨰에 '-'가 있다면 sign을 -1로 초기화 후 첫번쨰 문자열 제외한 문자열 반환
        	sign = -1; 
        	s = s.substring(1);
        }
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(Character.isDigit(c)) { // c가 숫자인경우에 true를 반환 
        		answer = answer * 10 + (c - '0'); // 문자열을 정수로 변환 '0'은 ASCII코드 48이기 때문에 
        	}
        }
        
        return answer * sign;
    }
}