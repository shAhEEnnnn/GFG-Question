class Solution {
    
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;

        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {

            // right
            for (int j = firstCol; j <= lastCol; j++)
                ans.add(arr[firstRow][j]);
            firstRow++;

            // down
            for (int i = firstRow; i <= lastRow; i++)
                ans.add(arr[i][lastCol]);
            lastCol--;

            if (firstRow <= lastRow) {
                // left
                for (int j = lastCol; j >= firstCol; j--)
                    ans.add(arr[lastRow][j]);
                lastRow--;
            }

            if (firstCol <= lastCol) {
                // up
                for (int i = lastRow; i >= firstRow; i--)
                    ans.add(arr[i][firstCol]);
                firstCol++;
            }
        }

        return ans;

    }
}
