import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 15; i++) {
            System.out.print(n * (i+1) + " ");
        }
    }
}