class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			int opt = signs[i] ? 1 : -1; // signs[i]가 true이면 양수 false이면 음수
			answer += absolutes[i] * opt;
		}
		

		
		
		
		return answer;
    }   
}