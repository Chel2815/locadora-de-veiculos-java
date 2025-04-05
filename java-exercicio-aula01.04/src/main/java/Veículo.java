public class Veículo {

    private String modelo;
    private double valorDiaria;

    public Veículo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("O valor da diária não pode ser negativo.");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("A quantidade de dias não pode ser negativa.");
        }
        return valorDiaria * dias;
    }

    public double desconto(int dias) {
        if (dias >= 7) {
            return calcularCusto(dias) * 0.1;
        }
        return 0;
    }

    public double calcularCustoComDesconto(int dias) {
        return calcularCusto(dias) - desconto(dias);
    }

    public double calcularMultaAtraso(int diasAlugado, int diasDevolvido) {
        if (diasDevolvido > diasAlugado) {
            int diasAtraso = diasDevolvido - diasAlugado;
            // Exemplo de multa: 5% do valor total por dia de atraso
            return calcularCustoComDesconto(diasAlugado) * 0.05 * diasAtraso;
        }
        return 0;
    }

    public double descontoProgressivo(int dias) {
        if (dias >= 7 && dias < 15) {
            return calcularCusto(dias) * 0.10;
        } else if (dias >= 15) {
            return calcularCusto(dias) * 0.15;
        }
        return 0;
    }

    public double calcularCustoTotalComDescontos(int dias) {
        double custoBase = calcularCusto(dias);
        double descontoAplicado = desconto(dias) + descontoProgressivo(dias);
        return custoBase - descontoAplicado;
    }
}

