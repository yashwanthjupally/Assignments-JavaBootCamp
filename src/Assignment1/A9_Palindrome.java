import java.util.Scanner;
public class A9_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String string = input.next();
        StringBuilder reverse = new StringBuilder(" ");

        int length = string.length();
        for (int i = length-1; i >= 0; --i) {
            reverse.append(string.charAt(i));
        }
        if (string.equalsIgnoreCase(reverse.toString())){
            System.out.println(string + " is palindrome");
        }
        else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
    wrongggggg
