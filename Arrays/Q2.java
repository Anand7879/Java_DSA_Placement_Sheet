package Arrays;

public class Q2 {
    public static void main(String[] args) {
        Ques2();
    }
    public static void Ques2()
    {
        // Reverse an array in place
        int arr[] = {2,4,5,6,7,23,25,20,1,100};
        int temp;
        int n  = arr.length;
        int k = arr.length-1;
        for(int i = 0; i<n/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[k-i];
            arr[k-i] = temp;
        }
        System.out.println("Reversed Array Is : ");
        for(int j = 0; j< arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }

    }
    
}
