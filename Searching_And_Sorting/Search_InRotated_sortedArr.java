package DSA_450.Searching_And_Sorting;

import java.util.Scanner;

public class Search_InRotated_sortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter values of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k to rotate array by k: ");
        int k = sc.nextInt();

        System.out.println("Rotated array by " + k + " steps is: ");
        rotateInplace(arr,k);
        printArray(arr);

        System.out.println("Enter value to be search in rotated array: ");
        int target = sc.nextInt();
        RotateSearch(arr,target);
    }
    static void reverseInplace(int[]arr,int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void rotateInplace(int[]arr,int k){
        int n = arr.length;
        k = k%n;
        reverseInplace(arr,0,n-k-1);
        reverseInplace(arr,n-k,n-1);
        reverseInplace(arr,0,n-1);
    }
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void RotateSearch(int[]arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index: "+i);
            }
        }
    }
}
