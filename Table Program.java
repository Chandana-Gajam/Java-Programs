import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int num;
        num = scan.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}