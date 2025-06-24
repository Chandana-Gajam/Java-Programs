import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Enter the number: ");
        n = scan.nextInt();

        factorial(n);
    }
    public static void factorial(int num){
        long fact = 1, temp = num;

        for(; num>0; num--){

            fact *= num;
        }
        System.out.println("!" + temp + " = " + fact);
    }
}