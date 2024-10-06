package DSA_450.Matrix;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r = sc.nextInt();
        System.out.println("Enter number of columns :");
        int c = sc.nextInt();
        int[][]arr = new int[r][c];
        System.out.println("Enter "+ r*c +" elments of arr :");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix :");
        printArray(arr);
        System.out.println("90 degree rotated matrix :");
        rotate(arr,r);
        printArray(arr);
    }
    static void printArray(int[][]arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][]arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }
    }

    static void reverse(int[]arr){
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][]arr,int n){
        transpose(arr,n,n);
        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }
    }
}
