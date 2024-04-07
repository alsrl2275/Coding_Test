import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
         int count = 0;
        int sum = 0;
        Arrays.sort(d); // 오름차순으로 정렬
        for(int i = 0; i < d.length; i++) {
        	if(sum + d[i] > budget) {
        		break;
        	}
        	
        	sum += d[i];
        	count++;
        }
        return count;
    }
}