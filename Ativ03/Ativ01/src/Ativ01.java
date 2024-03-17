import java.util.Scanner;

public class Ativ01 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, numero3;
        
        System.out.println("Escreva o primeiro número: ");
        numero1 = scanner.nextDouble();
        
        System.out.println("Escreva o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Escreva o terceiro número: ");
        numero3 = scanner.nextDouble();

        //maior numero
        double maior = Math.max(numero1, Math.max(numero2, numero3));

        //menor numero
        double menor = Math.min(numero1, Math.min(numero2, numero3));

        // média artimética
        double media = (numero1 + numero2 + numero3) /3;

        System.out.println("Dentre os números: " + numero1 + "," + numero2 + ", e " + numero3);
        System.out.println("Numero maior: " + maior);
        System.out.println("Numero menor: " + menor);
        System.out.println("Media Aritmetica: " + media);
        
       
    }
}
