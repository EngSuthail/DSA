class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            if (!Character.isLetterOrDigit(s.charAt(left)))       { left++;  }
            else if (!Character.isLetterOrDigit(s.charAt(right))) { right--; }
            else {
                char a = Character.toLowerCase(s.charAt(left));
                char b = Character.toLowerCase(s.charAt(right)); 
                if ( a != b) return false;
                else if( a == b ) {
                    left++;
                    right--;
                }
            }
            
        }
        return true;
    }
}