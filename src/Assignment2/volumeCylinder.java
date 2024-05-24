import java.util.Scanner;

public class volumeCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius, height: ");
        float pi = 3.1415F;
        int r = input.nextInt();
        int h = input.nextInt();
        float volume = (pi*(r*r)*h);
        System.out.println(volume);

    }
}
