package DSA_450.Arrays;

public class Find_Duplicates {
    static void duplicates(int[]arr){
        int n = arr.length;
        System.out.println("Duplicates numbers are :");
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {8, 2, 4, 2, 7, 8, 3, 9, 10, 4};
        duplicates(arr);
    }
}
