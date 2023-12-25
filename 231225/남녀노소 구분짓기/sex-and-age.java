import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        if (n == 0) {
            if (a >= 19) {
                System.out.print("MAN");
            }
            else {
                System.out.print("BOY");
            }
        }
        else {
            if (a >= 19) {
                System.out.print("WOMAN");
            }
            else {
                System.out.print("GIRL");
            }
        }
    }
}