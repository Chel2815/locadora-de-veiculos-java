import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Modelos Disponíveis: Cobalt - Valor da diária: 50, Kwid - Valor da diária: 40, Tracker - Valor da diária: 70 ");

        System.out.print("Informe o modelo do veículo: ");
        String modelo = scanner.nextLine(); // Use nextLine() para ler a linha inteira

        System.out.print("Digite o valor da diária: ");
        double valorDiaria = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();

        Veículo veiculo = new Veículo(modelo, valorDiaria);

        double custoTotal = veiculo.calcularCustoTotalComDescontos(diasAluguel);
        System.out.println("\n--- Resumo do Aluguel ---");
        System.out.println("Modelo do veículo selecionado: " + veiculo.getModelo());
        System.out.println("Valor da diária: R$" + String.format("%.2f", veiculo.getValorDiaria()));
        System.out.println("Dias de aluguel: " + diasAluguel);
        System.out.println("Custo total do aluguel: R$" + String.format("%.2f", custoTotal));

        if (diasAluguel >= 7) {
            System.out.println("Desconto por 7 dias ou mais aplicado: R$" + String.format("%.2f", veiculo.desconto(diasAluguel)));
        }

        double descontoProgressivo = veiculo.descontoProgressivo(diasAluguel);
        if (descontoProgressivo > 0) {
            System.out.println("Desconto progressivo aplicado: R$" + String.format("%.2f", descontoProgressivo));
        }

        System.out.print("\nInforme a quantidade de dias para devolução: ");
        int diasDevolvido = scanner.nextInt();
        double multaAtraso = veiculo.calcularMultaAtraso(diasAluguel, diasDevolvido);
        if (multaAtraso > 0) {
            System.out.println("Multa por atraso na devolução: R$" + String.format("%.2f", multaAtraso));
            System.out.println("Custo total com multa: R$" + String.format("%.2f", custoTotal + multaAtraso));
        }

        scanner.close();
    }
}
