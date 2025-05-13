package Arrays;

import java.util.Vector;

public class Q14 {
    public static void main(String[] args) {
        int [] arr = {1, 4, 20, 3, 2, 5}; 
        int target = 10;
        // int [] arr = {1, 4, 20, 3, 10, 5};
        // int target = 33;

        Subarray(target, arr);

    }
    
    // Subarray with given sum (Two pointer / Sliding window)

    static void Subarray(int target,int[] arr){
        
        int start = 0;
        int currentsum = 0;

        
        Vector<Vector<Integer>> result = new Vector<>();
        
        for (int end = 0; end< arr.length; end++){
            

            currentsum+=arr[end];
              
             while (currentsum > target && start <= end) {
            currentsum -= arr[start];
            start++;
        }
            
            if(currentsum == target)
            {
                Vector<Integer> sub = new Vector<>();
                for(int j = start; j<=end; j++)
                {
                      sub.add(arr[j]);
                }
                                                                     //int [] arr = {1, 4, 20, 3, 2, 5}; 
                                                                           //int target = 10;

                result.add(sub);
            }
        }
        if (result.size() == 0) {
            System.out.println("No subarray found with given sum.");
        } else {
            System.out.println("Subarrays with sum = " + target + ":");
            for (Vector<Integer> subarray : result) {
                System.out.println(subarray);
            }
    }
    }

}
