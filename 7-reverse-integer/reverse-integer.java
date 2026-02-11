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