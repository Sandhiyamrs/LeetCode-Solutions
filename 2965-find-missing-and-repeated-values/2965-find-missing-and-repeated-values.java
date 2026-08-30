class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];
        int repeat = -1, missing = -1;

        // Count occurrences
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        // Find the repeat (count == 2) and missing (count == 0)
        for (int i = 1; i <= size; i++) {
            if (count[i] == 2) {
                repeat = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeat, missing};
    }
}
