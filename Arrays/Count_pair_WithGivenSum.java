package DSA_450.Arrays;

public class Count_pair_WithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int target = 6;
        System.out.println(countPair(arr,target));
    }
    static int countPair(int[]arr,int target){
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
}
