import entities.Calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        char answer;
        do {
            System.out.println("Enter two integers:");
            int a = sc.nextInt(), b = sc.nextInt();
            int sum = calculator.sum(a, b);
            System.out.printf("%d + %d = %d\n", a, b, sum);

            System.out.println("Do you want to continue? [y/n]");
            while(true) {
                String input = sc.next().trim().toUpperCase();
                if (input.isEmpty()) {
                    continue;
                }
                answer = input.charAt(0);
                if (calculator.isValidAnswer(answer)) {
                    break;
                }
                System.out.println("Invalid answer, please enter Y or N.");
            }
        }while (answer == 'Y');
        sc.close();
    }
}
