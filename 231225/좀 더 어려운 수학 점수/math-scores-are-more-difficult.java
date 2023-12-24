import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int E = sc.nextInt();
        int m = sc.nextInt();
        int e = sc.nextInt();
        if (M > m || M == m && E > e) {
            System.out.print("A");
        }
        else {
            System.out.print("B");
        }
    }
}