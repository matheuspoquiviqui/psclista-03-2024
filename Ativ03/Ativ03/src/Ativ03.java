import java.util.Scanner;

public class Ativ03 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double a, b, c, raiz, raiz1, raiz2;

        System.out.println("Digite os coefciente para uma equação de segundo grau (ax^2 + bx + c = 0): ");
        System.out.print("Digite o primeiro numero: ");
        a = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        b = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        c = scanner.nextDouble();

        double delta = calcularDelta(a, b, c);

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente!!");

        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau!");
             raiz = -c / b;
            System.out.println("Raiz da equação: " + raiz);

        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais!");

        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais!");
             raiz = -b / (2 * a);
            System.out.println("Valor da raiz: " + raiz);

        } else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
             raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
             raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor da primeira raiz: " + raiz1);
            System.out.println("Valor da segunda raiz: " + raiz2);
        }

        scanner.close();
    }

    private static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;

    }
}
