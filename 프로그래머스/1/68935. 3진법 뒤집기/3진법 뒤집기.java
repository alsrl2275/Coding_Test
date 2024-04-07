class Solution {
    public int solution(int n) {
          int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
        	int a = n % 3;
        	sb.append(a);
        	n = n / 3;
        }
        answer = Integer.parseInt(sb.toString(), 3); // sb를 3진법으로 해석하여 정수로 변환
        System.out.println(answer);
        return answer;
    }
}