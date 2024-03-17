import java.util.Scanner;

public class Ativ04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoOperacao;
        double raio, perimetro, area, volume, calcularPerimetroCirculo, calcularAreaCirculo, calcularVolumeEsfera;

        System.out.println("Digite o código da operação (1 - Perímetro do círculo, 2 - Área do círculo, 3 - Volume da esfera):");
         codigoOperacao = scanner.nextInt();

        System.out.println("Digite o raio:");
         raio = scanner.nextDouble();

        switch (codigoOperacao) {
            case 1:
                 perimetro = calcularPerimetroCirculo(raio);
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            case 2:
                 area = calcularAreaCirculo(raio);
                System.out.println("Área do círculo: " + area);
                break;
            case 3:
                 volume = calcularVolumeEsfera(raio);
                System.out.println("Volume da esfera: " + volume);
                break;
            default:
                System.err.println("Erro: Código de operação inválido!");
        }

        scanner.close();
    }

    private static double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    private static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    private static double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}