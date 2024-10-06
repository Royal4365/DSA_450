package DSA_450.Searching_And_Sorting;

import java.util.Scanner;

public class Pair_Difference {
    public static void main(String[] args) {
        int[]arr = {5,20,3,2,5,80};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diffrence: ");
        int diff = sc.nextInt();
        int index = pairDifference(arr,diff);
        if (index == 1) {
            System.out.println("1");
        }else{
            System.out.println("-1");
        }

    }
    static int pairDifference(int[]arr,int diff){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[i]==diff){
                    return 1;
                }
            }
        }
        return -1;
    }
}
