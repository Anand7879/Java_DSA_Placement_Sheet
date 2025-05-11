package Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        if(IsSortedAndRotated(arr))
        System.out.println("Array Is Sorted And Rotated");
        else
        System.out.println("Array Is Not Sorted And Rotated");


    }

    //Check if array is sorted and rotated

    public static boolean IsSortedAndRotated(int[] arr){
        return IsIncreasingOrder(arr) || IsDecreasingOrder(arr);
    }

    private static  boolean IsIncreasingOrder(int [] arr)
    {
    int count = 0;
    int n = arr.length;
         for(int i = 0; i < n; i++){
               
            if( arr[i] > arr[(i+1)%n] ){
                count++;
            }

         }
         return count == 1;
    }
    
    private static  boolean IsDecreasingOrder(int [] arr)
    {
    int count = 0;
    int n = arr.length;
         for(int i = 0; i < n; i++){
               
            if( arr[i] < arr[(i+1)%n] ){
                count++;
            }

         }
         return count == 1;
    }
}
