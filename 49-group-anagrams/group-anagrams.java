class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++ ){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars); 
            String sorted = new String(chars);

            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            } 
            map.get(sorted).add(strs[i]);
            
        }
        String[][] result = new String[map.size()][];
        
        int i = 0;
        for (List<String> list : map.values()) {
            // Convert each individual list into a raw String array
            result[i] = list.toArray(new String[0]);
            i++;
        }
        
        return new ArrayList<>(map.values());
    }
}