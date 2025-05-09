package Arrays;

public class Q7 {

    public static void main(String[] args) {
        int[] arr = {5,2,6,3,4};
        rotateArray(arr);
        System.out.println("Rotated Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    //Cyclically rotate an array by one
    static void rotateArray(int [] arr){
        int temp = arr[0];
        for(int i = 0; i<arr.length-1; i++)
        {
              arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

}