import java.util.Scanner;
public class A3_PTR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter the time: ");
        double time = input.nextDouble();

        double interest = (principal*time*rate)/100;
        System.out.println("Simple Interest: " + interest);
    }
}
