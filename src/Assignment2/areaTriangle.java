import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the base and height: ");
        int b = input.nextInt();
        int h = input.nextInt();
        double area = (double) (b * h) /2;
        System.out.println(area);
    }
}
