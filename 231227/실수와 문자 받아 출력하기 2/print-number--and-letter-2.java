import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.printf("%.2f", y);
        System.out.print("\n");
        System.out.printf("%.2f", x);
        System.out.print("\n");
        System.out.println(s);
    }
}