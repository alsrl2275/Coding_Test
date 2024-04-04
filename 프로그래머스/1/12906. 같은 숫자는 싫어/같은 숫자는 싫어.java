import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    	int count = 0;						// 중복되는 횟수를 구함
    	for(int i = 1; i < arr.length; i++) {
    		if(arr[i] == arr[i-1]) {
    			count++;
    		}
    	}
    	int[] answer = new int[arr.length - count]; // 중복되는 숫자만큼 제거
    	answer[0] = arr[0]; // 처음 숫자는 그대로 배열에
    	int index = 1;
    	for(int i = 1; i < arr.length; i++) {
    		if(arr[i] != arr[i-1]) {
    			answer[index++] = arr[i];
    		}
    	}
        
        
        return answer;
    }
}