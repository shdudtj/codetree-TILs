import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        w *= 4;
        h += 3;
        System.out.println(w);
        System.out.println(h);
        System.out.println(w*h);
    }
}