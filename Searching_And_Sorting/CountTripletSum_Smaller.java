package DSA_450.Searching_And_Sorting;

public class CountTripletSum_Smaller {
    public static void main(String[] args) {
        int[]arr = {5,1,3,4,7};
        int sum = 12;
        int result = countTriplet(arr,sum);
        System.out.println(result);

    }
    static int countTriplet(int[]arr,int sum){
        int n = arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] < sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
