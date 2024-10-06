package DSA_450.Arrays;

public class BestTime_to_Buy_Sell {
    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};
        System.out.println(BestTime(arr));
    }
    static int BestTime(int[]arr){
        if(arr==null || arr.length<=1){
            return 0;
        }
        int minProfit = arr[0];
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++){
            minProfit = Math.min(minProfit,arr[i]);
            maxProfit = Math.max(maxProfit,arr[i]-minProfit);
        }
        return maxProfit;
    }
}
