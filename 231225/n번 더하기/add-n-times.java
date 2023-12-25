import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int i = a+n;
        while (i <= 7*n ) {
            System.out.println(i);
            i += n;
        }
    }
}