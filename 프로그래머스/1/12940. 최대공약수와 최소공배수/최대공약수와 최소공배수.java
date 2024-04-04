class Solution {
   public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = minBaesu(n, m);

        
        return answer;
    }
    
    public static int gcd(int n, int m) {
    	
        while(m != 0) { // 최대 공약수 구하는 공식
        	int temp = n % m;
        	n = m;
        	m = temp;
        }
        System.out.println(n);
        return n;
    }
    
    public static int minBaesu(int n, int m) {
    	int result = (n * m) / gcd(n, m);
    	System.out.println(result);
    	return result;
    }
}