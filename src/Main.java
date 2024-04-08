import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Seventh sec = new Seventh();
        sec.func(n, new int[]{1, 2, 3, 4});
    }
}
