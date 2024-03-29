
class Solution {
    public long solution(long n) {
		long answer = 0;
			

		
		long sqrtvalue = (long) Math.sqrt(n);
		if(sqrtvalue * sqrtvalue == n) {
			answer = (sqrtvalue + 1) * (sqrtvalue + 1);
		} else {
			answer = -1;
		}
		
		return answer;
    }
}