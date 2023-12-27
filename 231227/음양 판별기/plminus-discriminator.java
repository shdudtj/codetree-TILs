import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            if (n < 0)
                System.out.println("minus");
            else if (n > 0)
                System.out.println("plus");
            else
                System.out.println("zero");
        }
    }
}