package Arrays;

public class Q4 {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,2,2,0,0,0,2,1,1,0};
        Ques4(arr);
    }

// Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)
    static void Ques4(int[] arr){
    
         int [] count = {0,0,0};
         for(int i = 0; i<arr.length; i++)
         {
            if(arr[i]==0)
            {
                count[0]++;
            }else if(arr[i]==1)
            {
                count[1]++;
            }else
            {
                count[2]++;
            }
         }
         int k = 0;
         for(int j = 0; j<3; j++)
         {
            int c = 0;
            while(c < count[j])
            {
                arr[k]=j;
                k++;
                c++;
            }
         }
        System.out.println("Sorted Array: ");
        for(int j : arr)
        {
            System.out.print(j+" ");
        }

    
    }
}
