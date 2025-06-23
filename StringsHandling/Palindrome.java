package StringsHandling;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Stings : ");
        String input=scanner.nextLine();
        int i=0,j=input.length()-1;
       System.out.println(check(input,i,j));
        scanner.close();
    }
    public static boolean check(String input,int i,int j){
         while(i<=j){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
            i++;j--;
           
        }
        return true;
    }
}
