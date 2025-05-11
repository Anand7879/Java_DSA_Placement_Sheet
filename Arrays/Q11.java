package Arrays;

import java.util.Vector;

public class Q11 {

    public static void main(String[] args) {
         int [] arr = {1,2,-3,-4,5,-6,4,-1,-3,-7,-8};
        // int [] arr = {1,2,-1,3,4,-2};
         Rearrange(arr);
    }
    
    // Rearrange array in alternating positive & negative items

    static void Rearrange(int [] arr){
       
        Vector<Integer> vec1 = new Vector<>();
        Vector<Integer> vec2 = new Vector<>();
        
        
        for (int i : arr) {
            
            if(i>=0)
            {
                vec1.add(i);
            }else
            vec2.add(i);
        }
        System.out.println(vec1);
        System.out.println(vec2);
        int p = 0;
        int q = 0;
        int i = 0;

        while(p < vec1.size() && q < vec2.size())
        {
            arr[i++] = vec1.get(p++); 
            arr[i++] = vec2.get(q++);
        }  
        while (p<vec1.size()) {
            arr[i++] = vec1.get(p++);
        }    
        while (q<vec2.size()) {
            arr[i++] = vec2.get(q++);
        }    
        for (int  k : arr) {
            System.out.print(k + " ");
            
        }
    }
}
