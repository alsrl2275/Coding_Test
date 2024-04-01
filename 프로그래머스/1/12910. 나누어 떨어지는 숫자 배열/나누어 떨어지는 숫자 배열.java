import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int divisor) {
    	Arrays.sort(arr);
    	List<Integer> list = new ArrayList<>();
    	
    	for(int item : arr) {
    		if(item % divisor == 0) {
    			list.add(item);
    		}
    	}
    	
    	int listsize = list.size();
    	if(listsize == 0) {
    		int[] answer = {-1};
    		return answer;
    	}
    	
    	int[] answer = new int[listsize];
    	for(int i = 0; i < answer.length; i++) {
    		answer[i] = list.get(i);
    	}
    	
    	
    	return answer;
    }
}