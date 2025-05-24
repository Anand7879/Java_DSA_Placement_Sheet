public class Q37 {
    public static void main(String[] args) {
        int [][] mat = {{1,5,9},
                        {2,6,10},
                        {3,7,11},
                        {4,8,12}};
         int[][] result =  RotateMatrix(mat);
         for(int i = 0; i<result.length; i++)
        {
            for(int j = 0; j<result[0].length; j++)
            {
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }               
}
    
    // 37. Rotate matrix by 90 degrees clockwise

     static int[][] RotateMatrix(int[][] mat){

        int m = mat.length;
        int n = mat[0].length;
        int [][] result = new int[n][m];
        // int p = 0;
        // int q = m-1;

        for(int i = 0; i<m; i++)
        {
            // p = 0;
           for(int j = 0; j<n; j++)
           {
            //   result[p][q] = mat[i][j];
            //   p++;
             result[j][m-1-i] = mat[i][j];


           }
        //    q--;
        }
        return result;

     }     
}
