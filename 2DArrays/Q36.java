public class Q36 {

    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}};
        Transpose(arr);
        
    }

    //  Transpose of a matrix
    static void Transpose(int [][] arr)
    {
          
       int[][] TransposeMatrix = new int[arr[0].length][arr.length];
       
       for(int i = 0; i<arr.length; i++)
       {
           for(int j = 0; j<arr[i].length; j++)
           {
               TransposeMatrix[j][i] = arr[i][j];
           }
       }

       for(int i = 0; i<TransposeMatrix.length; i++)
       {
          for(int j = 0; j<TransposeMatrix[i].length; j++)
          {
            System.out.print(TransposeMatrix[i][j] +" ");
          }
          System.out.println();
       }
    }
}