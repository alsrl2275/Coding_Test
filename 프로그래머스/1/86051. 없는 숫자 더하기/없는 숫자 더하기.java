class Solution {
    public int solution(int[] numbers) {
		int answer = 0;
		for(int i = 0; i <= 9; i++) {
			boolean find = false;
			
			for(int num : numbers) {
				if(num == i) {
					find = true;
				}
			}
			
			if(find == false) {
				answer += i;
			}
		}
		
		return answer;
    }
}