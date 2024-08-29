import java.util.Scanner; // Importa a classe Scanner para ler entradas do usuário

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um scanner para ler entradas do terminal

        // Solicita e lê o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt(); // Lê um número inteiro do terminal

        // Solicita e lê o segundo parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt(); // Lê um número inteiro do terminal

        try {
            // Chama o método que realiza a contagem e valida os parâmetros
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Captura a exceção e imprime a mensagem de erro
            System.out.println(e.getMessage());
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }

    // Método que valida os parâmetros e realiza a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            // Lança a exceção personalizada com uma mensagem de erro
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir a contagem dos números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

