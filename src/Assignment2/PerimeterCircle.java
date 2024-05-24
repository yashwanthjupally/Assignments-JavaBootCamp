import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side: ");
        int a = input.nextInt();
        int perimeter = 4*a;
        System.out.println(perimeter);
    }
}
