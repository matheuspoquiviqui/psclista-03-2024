import java.util.Scanner;

public class Ativ05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1, n2, resultado;
        char operador;

        System.out.println("CALCULADORA:");
        System.out.print("Escreva o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.print("Escreva o segundo número: ");
        n2 = scanner.nextDouble();
        System.out.println("Digite o símbolo da operação: (+), (-), (*), (/), (^):");
        operador = scanner.next().charAt(0);

        resultado = 0;
        switch (operador) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(n1, n2);
                break;
            default:
                System.out.println("Erro: Símbolo de operação inválido!");
                return;
        }

        System.out.println("Resultado: " + n1 + " " + operador + " " + n2 + " = " + resultado + ".");

    }
}
