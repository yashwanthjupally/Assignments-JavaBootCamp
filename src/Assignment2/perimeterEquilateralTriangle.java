import java.util.Scanner;

public class perimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side: ");
        int a = input.nextInt();
        float perimeter = 3*a;
        System.out.println(perimeter);

    }
}
