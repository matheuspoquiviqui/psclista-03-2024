import java.util.Scanner;
import java.util.Random;

public class Ativ07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, maior, menor, aleatorio;
        
        System.out.print("Digite o primeiro número inteiro: ");
         n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
         n2 = scanner.nextInt();
        
         menor = Math.min(n1, n2);
         maior = Math.max(n1, n2);
        
        Random random = new Random();
         aleatorio = random.nextInt(maior - menor + 1) + menor;
        
        System.out.println("\nNúmero sorteado: " + aleatorio);
        
        if (aleatorio % 2 == 0) {
            System.out.println("O número sorteado é par.");
        } else {
            System.out.println("O número sorteado é ímpar.");
        }
        
        scanner.close();
    }
}