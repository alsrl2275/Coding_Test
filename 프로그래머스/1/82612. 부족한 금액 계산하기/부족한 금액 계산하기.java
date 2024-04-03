class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int cnt = 1;
        for(int i = 0; i < count; i++) {
        	answer += price * cnt++;
        	
        }
        if(answer > money) {
        	answer = answer - money;
        } else {
        	answer = 0;
        }
        return answer;
    }
}