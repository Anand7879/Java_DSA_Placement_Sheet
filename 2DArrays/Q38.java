public class Q38 {
    public static void main(String[] args) {

        int [][] mat = {{1,  4,  7, 11},
                        {2,  5,  8, 12},
                        {3,  6,  9, 16},
                        {10, 13, 14,17}};
      
                       
        int traget = 17;
        Search(mat,traget);
        
    }
    // Search in a row-wise and column-wise sorted matrix
    static void Search(int[][] mat,int traget){

           int m = mat.length;
           int n = mat[0].length;
           int i = 0;
           int j = n-1;
          
           while (i<m && j>=0) {
            
             if(mat[i][j]==traget)
             {
               System.out.println("Target Found At Index "+ i+j);
               return;
             }else if(mat[i][j]>traget)
             {
                j--;
             }else{
                i++;
             }
           }
    }
}
