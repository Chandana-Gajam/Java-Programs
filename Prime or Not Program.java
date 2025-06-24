import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();

        PrimeOrNot(n);
    }

    public static void PrimeOrNot(int num){

    int flag = 0;

    if(num == 1)
         flag = 1;

         for(int i=2; i<=Math.sqrt(num); i++){

            if(num%i == 0){
                flag = 1;
                break;
            }
         }
         if(flag == 0){
            System.out.println(num + " is a Prime number");
         }else{
            System.out.println(num + " is NOT a Prime number");
         } 
    }           
}