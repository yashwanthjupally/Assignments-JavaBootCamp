import java.util.Scanner;

public class A4_GreaterNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num1 = input.nextInt();
        System.out.print("Enter any number: ");
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2 );
        }
        else{
            System.out.println(num2 + " is greater than 13" + num1);
        }
    }
}
