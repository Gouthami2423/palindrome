import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        String input=scanner.nextLine();
        String reversed =new StringBuilder(input).reverse().toString();
        if(input.equals(reversed)){
            System.out.println("the number is a palindrome");
        }else{
            System.out.println("the number is not a palindrome");
        }
        scanner.close();
    }
}
