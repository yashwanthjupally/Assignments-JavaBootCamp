import java.util.Scanner;

public class TSACube{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side: ");
        int a = input.nextInt();
        int TSA = 6*(a*a);
        System.out.println(TSA);

    }
}
