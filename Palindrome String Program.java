import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        String str, rev="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");

        str = scan.nextLine();

        int length = str.length();

        for(int i=length-1; i>=0; i--){

            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is a Palindrome");
        }else{
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}