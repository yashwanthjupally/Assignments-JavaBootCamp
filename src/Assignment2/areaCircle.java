import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = input.nextInt();
        double pi = 3.1415, area;
        area = pi * r * r;
        System.out.println("Area of circle: " + area);
    }
}
