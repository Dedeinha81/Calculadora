import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcula o resultado com base no operador
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                // Verifica se o divisor é zero
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    scanner.close();
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido!");
                scanner.close();
                return;
        }

        // Exibe o resultado
        System.out.printf("Resultado: %.2f\n", resultado);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    

        
    }

}
