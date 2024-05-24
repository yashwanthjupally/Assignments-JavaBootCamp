import java.util.Scanner;

public class volumeSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius: ");
        float pi = 3.1415F;
        int r = input.nextInt();
        float volume = (4*pi*r*r*r)/3;
        System.out.println(volume);

    }
}
