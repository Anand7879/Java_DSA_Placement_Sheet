package Arrays;

import java.util.HashMap;

public class Q13 {

    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2,2,6};
        int target = 7;
        Find_Pairs(arr, target);
    }
    // Find all pairs with a given sum
    
    static void Find_Pairs(int [] arr,int target){
     
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        for(int i = 0; i < arr.length; i++){
            complement = target-arr[i];   

            if (map.containsKey(complement)) {
                      for (int j = 0; j < map.get(complement); j++) {
            System.out.println("(" + arr[i] + ", " + complement + ")");
            }
        }
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

    }
}