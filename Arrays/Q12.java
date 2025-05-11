package Arrays;

import java.util.Scanner;


// Count the number of occurrences of an element
public class Q12 {
    public static void main(String[] args) {
        int [] arr = {2,4,5,2,2,2,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Element To Find Occurrence : ");
        int x = sc.nextInt();
        
        System.out.println("Number Of Occurrance : "+ occurrencesCount(arr, x));
        sc.close();
    }
    // Count the number of occurrences of an element

    static int occurrencesCount(int [] arr, int x){
       int count = 0;
        for (int i : arr) {
            if(i == x)
            count++;
        }
      return count;
    }
    
}
