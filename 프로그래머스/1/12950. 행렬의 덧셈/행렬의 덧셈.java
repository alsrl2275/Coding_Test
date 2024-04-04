class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length; // 행의 수
        int cols = arr1[0].length; // 첫번쨰 행의 열수
        int[][] answer = new int[rows][cols];
        
        for(int i = 0; i < rows; i++) {
        	for(int j = 0; j < cols; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }
}