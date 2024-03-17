import java.util.Scanner;

public class Ativ02{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        double valorCompra, valorPago, troco;

        System.out.print("Valor da compra: R$");
        valorCompra = scanner.nextDouble();

        System.out.print("Valor pago: R$");
        valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.err.println("VALOR INSUFICIENTE PARA REALIZAR A COMPRA!");
        }
         
        else if (valorPago > valorCompra){

          troco = valorPago - valorCompra;
            System.out.println("Troco: R$ " + troco);

            int[] notas = {50, 20, 10, 5, 2, 1};
            int[] quantidadeNotas = new int[notas.length];

            // Calcular a quantidade de cada nota
            for (int i = 0; i < notas.length; i++) {
                quantidadeNotas[i] = (int) (troco / notas[i]);
                troco %= notas[i];
            }

            // Exibir o troco e a quantidade de cada nota
            System.out.println("Troco: R$" + (valorPago - valorCompra));
            for (int i = 0; i < notas.length; i++) {
                if (quantidadeNotas[i] > 0) {
                    System.out.println("Quantidade de notas de R$" + notas[i] + ": " + quantidadeNotas[i]);
        }
    }
    }
}
}