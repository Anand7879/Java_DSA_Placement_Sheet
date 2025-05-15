package Arrays;

import java.util.HashSet;

public class Q16 {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,2,1,5};
        System.out.println("Duplicate Elements : ");
       System.out.println(FindDuplicate(arr));
    }
    // Find duplicate number in array

    static HashSet<Integer> FindDuplicate(int[] arr){

        int n = arr.length;
       HashSet<Integer> set1 = new HashSet<>();
       HashSet<Integer> duplicates = new HashSet<>();


// Brute Force Approach
        // for(int i = 0; i<n; i++)
        // {
        //     int digit = arr[i];
        //     for(int j = i+1; j<n; j++)
        //     {
        //        if(arr[j] == digit)
        //        {
        //             System.out.print(digit+" ");
        //        }
        //     }
        // }

// Optimal Approach
          for (int num : arr) {
            
            if(!set1.add(num))
            {
                duplicates.add(num);
            }
          }
          
          return duplicates;
    }
    
}
