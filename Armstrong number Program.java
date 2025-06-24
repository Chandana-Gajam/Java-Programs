import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=0, n=0, r=0, temp;
        num = in.nextInt();
        temp = num;

        for(; num>0; num/=10){

            n = num%10;
            r = r + (n*n*n);
        }
        if(temp == r){
            System.out.println(temp + " is a Armstrong number");
        }else{
            System.out.println(temp + " is NOT a Armstrong number");
        } 
    }
}