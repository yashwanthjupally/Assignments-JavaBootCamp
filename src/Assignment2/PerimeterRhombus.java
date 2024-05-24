import java.util.Scanner;

public class PerimeterRhombus{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input sides: ");
        int a = input.nextInt();
        int b = input.nextInt();
        float perimeter = 2*(a+b);
        System.out.println(perimeter);

    }
}

