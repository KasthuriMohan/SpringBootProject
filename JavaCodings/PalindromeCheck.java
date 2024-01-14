package JavaCodings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number to check Palindrome or not: ");
        int n, tmp, rem, num=0;
        n = s.nextInt();
        tmp = n;
        while(tmp > 0){
            rem = tmp%10;
            num = (num*10) + rem;
            tmp/=10;
        }
        if(num == n){
            System.out.println(n+" Number is Palindrome");
        }
        else{
            System.out.println(n+" Number is not a Palindrome");
        }
    }
}
