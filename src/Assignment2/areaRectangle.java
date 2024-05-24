import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and breadth of rectangle: ");
        int l = input.nextInt();
        int b = input.nextInt();
        float area = l*b;
        System.out.println(area);

    }
}
