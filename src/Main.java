import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            int a = scanner.nextInt(), b = scanner.nextInt();
            System.out.printf("%d + %d = %d\n", a, b, a + b);
            System.out.println("Do you want to continue? [y/n]");
            answer = String.valueOf(scanner.next().toUpperCase(Locale.ROOT).trim().charAt(0));
        }while (answer.equals("Y"));
    }
}