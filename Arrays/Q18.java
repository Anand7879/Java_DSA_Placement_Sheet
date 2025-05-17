package Arrays;

public class Q18 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        RainWater(arr);

    }

    // Trapping Rain Water
    
    static void RainWater(int [] arr)
    {
        int max = 0;
        for (int i : arr) {
            if(arr[i]>max)
            max = arr[i];
        }
        
        int n = arr.length;
        int left = 0 , left_max = 0;
        int right = n-1 , right_max = 0;

        int Water = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i]!=0)
            {
                left_max = Math.max(left_max, arr[i]);
                right_max = Math.max(arr[i+1], arr[i+2]);
                 

                Water+= Math.min(left_max, right_max);

            }
        }
        System.out.println(Water);

        

    }

}
