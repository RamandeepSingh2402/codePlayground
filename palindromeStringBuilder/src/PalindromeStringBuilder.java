import java.util.Scanner;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPalindrome(num));

    }
    static boolean isPalindrome(int num){
        String stringNum = Integer.toString(num);
        StringBuilder str = new StringBuilder(stringNum);
        String newString = str.toString();
        String reverseString = str.reverse().toString();
        System.out.println(newString);
        System.out.println(reverseString);
        if(newString.equals(reverseString)){
            return true;
        }
        else{
            return false;
        }
    }
}
