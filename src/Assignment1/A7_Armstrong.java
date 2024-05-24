import java.util.Scanner;

public class A7_Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int a = temp % 10;
            sum += a*a*a;
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not");
        }
    }
}
