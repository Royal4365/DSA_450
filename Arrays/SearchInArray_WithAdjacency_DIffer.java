package DSA_450.Arrays;

public class SearchInArray_WithAdjacency_DIffer {
    public static void main(String[] args) {
        int[]arr = {20, 40, 50, 70, 70, 60} ;
        int x = 60, k = 20,n = arr.length;

        System.out.println("Element "+ x +" is present at index "+search(arr,n,x,k));
    }
    static int search(int[]arr,int n,int x,int k){
        int i=0;
        while(i<n){
            if(arr[i]==x){
                return i;
            }
            i = i + Math.max(1,Math.abs(arr[i]-x)/k);
        }
        System.out.println("Number not present");
        return -1;
    }
}
