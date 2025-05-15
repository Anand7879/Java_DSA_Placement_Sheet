package Arrays;

import java.util.HashSet;

public class Q17 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        System.out.println("Intersection Of Given Arrays : ");
       System.out.println(FindIntersection(arr1, arr2));

        
        
    }
    
    //  Find intersection of two sorted arrays
    
    static HashSet<Integer> FindIntersection(int[] arr1, int[] arr2){
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

         for (int num : arr2) {
            set2.add(num);
        }
    set1.retainAll(set2);
    
     return set1;
    }


}
