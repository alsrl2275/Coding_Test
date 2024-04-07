class Solution {
    public int solution(String t, String p) {
		int answer = 0;
		int len = p.length();
		long Lp = Long.parseLong(p);
		for(int i = 0; i <= t.length() - len; i++) {
			long Lt = Long.parseLong(t.substring(i, len + i));
			if(Lt <= Lp) {
				answer++;
			}
		}
		return answer;
    }
}