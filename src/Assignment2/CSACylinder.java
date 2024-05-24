import java.util.Scanner;

public class CSACylinder{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius, height: ");
        float pi = 3.1415F;
        int r = input.nextInt();
        int h = input.nextInt();
        float CSA = (float) (2*pi*r*h);
        System.out.println(CSA);

    }
}
