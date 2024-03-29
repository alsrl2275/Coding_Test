class Solution {
    public String solution(String[] seoul) {
		String answer = "";
		int count = 0;
		
		for(String find : seoul) {
			if(find.equals("Kim")) {
				answer = "김서방은 " + count + "에 있다";
			}
			count++;
		}

		return answer;
    }
}