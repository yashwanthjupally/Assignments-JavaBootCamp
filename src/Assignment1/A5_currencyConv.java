import java.util.Scanner;

public class A5_currencyConv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in rupee: ");
        int rupee = input.nextInt();
        double Dollar = rupee * 81.96;
        System.out.println("The amount in $ is " + Dollar);
    }
}
