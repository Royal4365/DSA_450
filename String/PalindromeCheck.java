package DSA_450.String;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrome(s)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

    }
    public static boolean isPalindrome(String s){
        int start =0;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
