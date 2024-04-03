class Solution {
        public boolean solution(String s) {
          return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
        }
}