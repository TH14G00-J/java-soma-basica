import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler entradas do teclado
        Scanner scanner = new Scanner(System.in); 
        String answer; // Armazenará a resposta do usuário (Y/N)
        do { 
            // 1. Lê dois números inteiros:
            int a = scanner.nextInt(), b = scanner.nextInt(); 
            
            // 2. Exibe a soma formatada:
            System.out.printf("%d + %d = %d\n", a, b, a + b);
            
            // 3. Pergunta se deseja continuar:
            System.out.println("Do you want to continue? [y/n]");

            // 4. Lê a resposta, converte para maiúscula e pega o primeiro caractere:
            answer = String.valueOf(scanner.next().toUpperCase(Locale.ROOT).trim().charAt(0));
        }while (answer.equals("Y"));// Repete enquanto a resposta for "Y"

        // Obs.: O programa encerra automaticamente se a resposta não for "Y"
    }
}
