import java.util.Arrays;
class Solution {
    public long solution(long n) {
		long answer = 0;
		
		String str = String.valueOf(n);
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
			
		}
		
        // 오름차순 정렬
		Arrays.sort(arr);
		
        // 정렬된 배열을 이용하여 answer 계산
        for (int i = arr.length - 1; i >= 0; i--) {
            answer = answer * 10 + arr[i];
            System.out.println(answer);
        }

        return answer;
    }
}