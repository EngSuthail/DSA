class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        result.add(row1);
        if(numRows == 1) return result;

        List<Integer> row2 = new ArrayList<>(List.of(1,1));
        result.add(row2);
        if(numRows == 2) return result;

        for(int i = 2; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 0; j < result.get(i-1).size() - 1; j++){
                row.add(result.get(i-1).get(j) + result.get(i-1).get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
