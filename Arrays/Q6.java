package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {
        int [] arr1= {1,2,3,3};
        int [] arr2= {3,4,5,6,7};
        FindUnion(arr1,arr2);
        FindIntersection(arr1, arr2);

    }
    // Find Union and Intersection of two arrays


    static void FindUnion(int []arr1,int[] arr2)
    {
        HashSet<Integer> uniqueArr = new HashSet<>();
        for (int num : arr1) {
            uniqueArr.add(num);
        }
        for (int num : arr2) {
            uniqueArr.add(num);
        }
    
        int [] ans = new int[uniqueArr.size()];
        int k = 0;
        for (int i : uniqueArr) {
            ans[k++] = i;
        }
        System.out.println("Union Of Given Arrays: ");
        for (int num : ans) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static void FindIntersection(int [] arr1, int[] arr2)
    {
        Set<Integer> setA = new HashSet<>();
        for (int num : arr1) {
            setA.add(num);
        }

        Set<Integer> setB = new HashSet<>();
        for (int num : arr2) {
            setB.add(num);
        }

        setA.retainAll(setB);

        System.out.print("Intersection : ");
        for (int num : setA) {
            System.out.print(num+" ");
        }
    }
}
