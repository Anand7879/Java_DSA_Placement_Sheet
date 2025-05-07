package Arrays;

public class Q5 {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,-6,-2,-5,4,5,3,8,9};
        Sort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    //Move all negative numbers to beginning and positive to end
    static void Sort(int [] arr,int lb,int ub)
    {
        int x,l,r,t;
        if(lb>=ub)
        return;

        l = lb;
        r = ub;
        x = arr[lb];

        while(l<r)
        {
            while(arr[l]<=x && l<r)
            {
                l++;
            }
            while(arr[r]>x)
            {
                r--;

            }

            if(l<r)
            {
                t = arr[l];
                arr[l]=arr[r];
                arr[r] = t;
            }
        }
        arr[lb] = arr[r];
        arr[r] = x;
        Sort(arr,lb,r-1);
        Sort(arr,r+1,ub);
    }
}
