class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        int cnt = 1;
        for(int i = 0; i < count; i++) {
        	sum += price * cnt++;
        	
        }
        if(sum > money) {
        	answer = sum - money;
        } else {
        	answer = 0;
        }
        System.out.println(sum);

        return answer;
    }
}