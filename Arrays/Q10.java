package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
    public static void main(String[] args) {
        int [] arr = {16,17,4,3,5,2};
        System.out.println("Leader In The Given Array : ");
        System.out.println(Leaders(arr));
        
    }
    
    // Leaders in an array
    static ArrayList Leaders(int [] arr){
          
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[n-1]);
        boolean flag = true;
        for(int i = n-2; i>=0; i--)
        {
            if(arr[i]>arr[i+1] && flag)
            {
                list.add(arr[i]);
            }else
            {
                flag = !flag;
            }
        }
      Collections.reverse(list);
        return list;
    }
}
