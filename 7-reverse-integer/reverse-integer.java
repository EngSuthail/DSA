/*
Time: 1 ms (99.77%) | Memory: 42.9 MB (24.81%) - LeetSync

Intuition
Want to return the reversed number with its sign as well and there is a constraint that if it overflows have to return 0

Approach
I wanted to iterate through the number in reverse order, so that i can reverse it. For that i changed it to String. To consider the sign, i checked with whether it is smaller or bigger than 0. If it is negative number, i stopped with the number in the iteration. For the overflow, i store all the values as long number in the reverse order.

Complexity
Time complexity:
O(log(x)) where x is number of digits in the input

Space complexity:
O(log(x)) where x is number of digits in the input
*/

class Solution {
    public int reverse(int x) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        String numStr = String.valueOf(x);
        long store = 0;

        if(x > 0){
            for(int i=numStr.length() - 1; i >= 0; i--){
            int digit = Character.getNumericValue(numStr.charAt(i));
            store = digit + store*10;
            }
        } else if (x < 0){
            for(int i=numStr.length() - 1; i>=1; i--){
            int digit = Character.getNumericValue(numStr.charAt(i));
            store = digit + store*10;
            }
        }
        if(x<0){
            if(-store < min) return 0;
        return (int) -store;
        } else{
            if(store> max) return 0;
        return (int) store;
        }
        
    }
}
