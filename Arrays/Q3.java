package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Ques3();
    }
    public static void Ques3()
    {
        // Find the 'Kth' max and min element of an array
        int arr[] = {2,4,5,6,7,23,25,20,1};
        Arrays.sort(arr);
        int n = arr.length;
        int kth_max = arr[n-1];
        int kth_min = arr[0];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k : ");
        int k = sc.nextInt();
        int count = 0;

        for(int i = n-1; count!=k; i--)
        {
            kth_max = arr[i];
            count++;
        }
        System.out.println(k+" Max : "+ kth_max);

        count = 0;
        for(int i = 0; count!=k; i++)
        {
            kth_min = arr[i];
            count++;
        }
        System.out.println(k+" Min = "+kth_min);

}
}