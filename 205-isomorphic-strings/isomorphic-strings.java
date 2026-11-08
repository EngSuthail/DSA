class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> sTot = new HashMap<>();
        Map<Character, Character> tTos = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
           
            if(sTot.containsKey(a) && sTot.get(a) != b) return false;
            if(tTos.containsKey(b) && tTos.get(b) != a) return false;
            
            sTot.put(a, b);
            tTos.put(b,a);
        }
        return true;
    }
}