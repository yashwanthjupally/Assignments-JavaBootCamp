import java.util.Scanner;

public class volumePyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input length, width, height: ");
        int l = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        float volume = (float) (l * w * h) /3;
        System.out.println(volume);

    }
}
