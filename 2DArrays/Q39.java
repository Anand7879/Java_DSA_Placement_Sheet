public class Q39 {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
                        Spiral(mat);
    }
    // Spiral traversal of a matrix
    
    static void Spiral(int[][] mat){

        int m = mat.length;
        int n = mat[0].length;
        int k = 0;

       int[] result = new int[m*n];
      
      int top = 0;
      int bottom = m-1;
      int left = 0;
      int right = n-1;
       while (top <= bottom && left <= right) {
            // Step 1: Traverse from Left to Right
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // Step 2: Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            // Step 3: Traverse from Right to Left (if rows remain)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            // Step 4: Traverse from Bottom to Top (if columns remain)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }


    }
}
}
