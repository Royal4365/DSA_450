package DSA_450.String;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        System.out.println("Original String:" + Arrays.toString(s));
        reverseString(s);
        System.out.println("Reversed String: " + Arrays.toString(s));
    }
    static void reverseString(char[] s) {
        int start =0;
        int end = s.length -1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
