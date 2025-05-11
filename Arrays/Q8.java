package Arrays;

public class Q8 {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        KadaneAlgo(arr);
        
    }

    //Kadane's Algorithm - Maximum Subarray Sum
    
    static void  KadaneAlgo(int[] arr)
    {
        int current_sum = arr[0];
        int max_sum = arr[0];
        
        int start = 0, end = 0, tempStart = 0;

        for(int i = 1; i<arr.length; i++)
        {
            
            if(arr[i]>current_sum+arr[i])
            {
                current_sum = arr[i];
                tempStart = i;
            }else
            current_sum+=arr[i];

            if(current_sum>max_sum)
            {
                max_sum = current_sum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("Maximum SubArray : ");

        for(int i = start; i <=end; i++)
        {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Max SubArray Sum is : "+ max_sum);
        
    }

    
    
}
