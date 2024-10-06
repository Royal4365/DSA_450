package DSA_450.Arrays;

import java.util.Arrays;

public class union_intersection {

    public static void main(String[] args) {
        int[]arr1 = {1,2,3,3};
        int []arr2 = {1,3,6,4};
        int n = arr1.length;
        int m = arr2.length;

        System.out.println("Intersection of two array is at: ");
        intersection(arr1,arr2,n,m);

        System.out.println("Union of two array is: ");
        union(arr1,arr2,n,m);
    }
    static void intersection(int []arr1,int []arr2,int n,int m){
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            } else if(arr1[i]>arr2[j]) {
                j++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
    static int union(int []arr1,int []arr2,int n,int m){
        int []arr3 = new int[m+n];
        System.arraycopy(arr1,0,arr3,0,n);
        System.arraycopy(arr2,0,arr3,n,m);
        Arrays.sort(arr3);

        int count =0;
        for(int i=1;i<n+m;i++){
            if(arr3[i]!=arr3[i-1]){
                count++;
                System.out.print(arr3[i-1]+" ");
            }
        }
        System.out.println(arr3[n+m-1]);
        return count;
    }
}
