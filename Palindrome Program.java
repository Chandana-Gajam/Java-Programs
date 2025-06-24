import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sn.nextInt();

        PalindromeOrNot(x);
    }

    public static void PalindromeOrNot(int num){

        int n=0, r=0, temp = num;
        
        for(; num>0; num/=10){

            n = num%10;
            r = r*10+n;
        }
        if(temp == r){
            System.out.println(r + " is a Palindrome");
        }else{
            System.out.println(r + " is NOT a Palindrome");
        }
    }
}