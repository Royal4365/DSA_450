package DSA_450.Searching_And_Sorting;

import java.util.Arrays;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int []arr = {1,0,2,1,1,0,0,2,1,2,2,0,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr) {
        int n = arr.length;
        int low = 0,mid = 0,high = n -1;
        while(mid <= high) {
            if(arr[mid] == 0){
                swap(arr,low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
