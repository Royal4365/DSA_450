package DSA_450.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int []arr = {1,4,45,6,10,8};
        int target = 13;
        System.out.println(sum(arr,target));
    }
    static int sum(int[]arr,int target){
        int n = arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
