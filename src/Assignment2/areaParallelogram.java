import java.util.Scanner;

public class areaParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("base, height: ");
        int b = input.nextInt();
        int h = input.nextInt();
        float area = b*h;
        System.out.println(area);
    }
}
