import java.util.Scanner;

public class A8_Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any limit: ");
        int n = input.nextInt();
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a+b;

        }
    }
}
