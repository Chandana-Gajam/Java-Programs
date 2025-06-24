import java.util.Scanner;

public class ReversedNumber{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num=0, n=0, r=0;
        System.out.println("Enter the number: ");
        num = scan.nextInt();

        for(; num>0; num/=10){

            n = num%10;
            r = r*10+n;
        }    
        System.out.println("Reversed number: " + r);

    }
}