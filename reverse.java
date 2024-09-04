package reverse;

import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }   
    static void reverse(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char temp =str.charAt(right);
//            str.charAt(right)=str.charAt(left);
//            str.charAt(left) = temp;
            right++;
            left++;
        }
        System.out.println(str);
    } 
    }