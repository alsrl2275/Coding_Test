class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) { // 배열에서 가장 작은 값 찾기
        	if(arr[i] < min) {
        		min = arr[i];
        	}
        }
        
        int[] answer = new int[arr.length - 1]; // 새로운 배열 생성
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != min) {
        		answer[index++] = arr[i];
        	}
        }
        if(arr.length == 1) {
        	return new int[]{-1};
        }
        return answer;
    }
}