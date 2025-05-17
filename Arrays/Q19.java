package Arrays;

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
        
        int []arr1 = {1,4,7,8,10};
        int []arr2 = {2,3,9};
       Merge(arr1, arr2);
    }

    // Merge two sorted arrays without using extra space
     static void Merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;     
        
        int i = n-1, j=0;

       while (i>=0 && j<m-1) {
              
            if(arr1[i]>arr2[j])
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;;
       }
      
       Arrays.sort(arr1);
       Arrays.sort(arr2);
        
       for (int num : arr1) {
         System.out.print(num + " ");
       }
        for (int num : arr2) {
         System.out.print(num + " ");
       }

     }
    
}
