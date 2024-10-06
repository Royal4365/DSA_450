package DSA_450.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr,0,arr.length-1);
        System.out.println("reverse array :");
        printArray(arr);
    }
    static void reverse(int[]arr,int start,int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
