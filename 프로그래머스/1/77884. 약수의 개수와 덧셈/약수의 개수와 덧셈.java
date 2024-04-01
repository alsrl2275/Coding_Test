class Solution {
    public int solution(int left, int right) {
		int answer = 0;
		
		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		
//		for(int i = left; i <= right; i++) {
//			
//			if(i % Math.sqrt(i) == 0) { // 약수의 개수가 홀수이면 제곱수이다.
//				answer -= i;
//			} else {
//				answer += i;
//			}
//		}
		return answer;
    }
}