# Projeto Locadora de Veículos

Este projeto Java simula o aluguel de veículos. A classe `Veiculo` calcula custos, aplica descontos (por tempo e progressivos) e multa por atraso. A classe `Main` permite interagir com o usuário para alugar um veículo, e a classe `VeiculoTest` contém testes para verificar o funcionamento da classe `Veiculo`.

## Funcionalidades Principais

* **`Veiculo.java`:** Representa um veículo com modelo e valor da diária. Possui métodos para calcular custo de aluguel, aplicar descontos (por 7+ dias e progressivo) e calcular multa por atraso.
* **`Main.java`:** Permite ao usuário escolher um modelo, inserir o valor da diária e os dias de aluguel. Exibe o resumo do aluguel, incluindo custos e descontos. Também permite informar a data de devolução para calcular multas.
* **`VeiculoTest.java`:** Contém testes unitários usando JUnit para validar os cálculos da classe `Veiculo`.

## Como Instalar e Rodar (Usando Maven)

### Requisitos

* **Java Development Kit (JDK):** Você deve ter o JDK instalado.
* **Maven:** É necessário ter o Maven instalado no seu computador.

### Passos

1.  **Clonar o Repositório :**
    Clone o repositório para o seu computador seguindo estes passos
    ```bash
    git clone <URL_DO_REPOSITORIO>
    cd <NOME_DO_REPOSITORIO>
    ```

2.  **Abrir o Projeto na IDE:**
    Abra a pasta do projeto na IDE de Java (O projeto foi desenvolvido no IntelliJ).

3.  **Executar a Classe `Main`:**
    * Na IDE, navegue até o arquivo `Main.java`.
    * Clique com o botão direito e selecione "Run" ou "Executar".
    * O programa será executado no console.
