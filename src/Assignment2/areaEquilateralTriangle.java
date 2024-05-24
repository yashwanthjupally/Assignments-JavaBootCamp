import java.util.Scanner;

public class areaEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side: ");
        int a = input.nextInt();
        double area = (Math.sqrt(3)/4)*(a*a);
        System.out.println(area);


    }
}
