package DSA_450.Arrays;

import java.util.Arrays;

public class Move_negative {
//    Method 1
//    public static void main(String[] args) {
//        int []arr = {1,5,3,-2,-4,-3,7,-5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }


//    Method 2
    public static void main(String[] args) {
        int []arr = {1,5,3,-2,-4,-3,7,-5};
        int n =arr.length;
        arrange(arr,n);
        printArray(arr,n);
    }
    static void arrange(int[]arr,int n){
        int j=0,temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
