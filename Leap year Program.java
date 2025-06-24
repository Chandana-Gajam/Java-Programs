import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sn.nextInt();

        if((year % 400 == 0)
        || ((year % 4 == 0) && (year % 100 !=0))){
            System.out.println(year + ": Leap year");
        }else{
            System.out.println(year + ": NOT a Leap year");
        }
    }
}