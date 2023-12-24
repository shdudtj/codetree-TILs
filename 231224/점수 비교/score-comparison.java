import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int E = sc.nextInt();
        int m = sc.nextInt();
        int e = sc.nextInt();
        if (M > m && E > e) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}