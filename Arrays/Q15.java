package Arrays;

import java.util.HashSet;

public class Q15 {

    public static void main(String[] args) {
         int [] arr = {1, 2, 6, 7, 9}; // n = 6
          System.out.println("Missing Terms : ");
          FindMissing(arr);
        
    }
    
    // Missing number in array [1 to n]
   static void FindMissing(int[] arr)
   {
        int n = arr[arr.length-1];

        HashSet <Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for(int i = 1; i<n; i++)
        {
            if(!set.contains(i))
            {
                System.out.print(i + " ");
            }
        }
   }

}
