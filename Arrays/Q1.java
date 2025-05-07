package Arrays;

public class Q1 {

    public static void main(String[] args) {
        Ques1();
    }
    public static void Ques1()
    {
        //Find the maximum and minimum element in an array
        int arr[] = {2,4,5,6,7,1,10};
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element : " +max);
        System.out.println("Minimum Element : " +min);

    }
}