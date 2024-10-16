import java.util.Scanner;

public class Calculadora {
    private PilhaGenerica<Double> pilhaValores;
    private PilhaGenerica<Character> pilhaOperadores;
    private Scanner scanner;

    public Calculadora() {
        pilhaValores = new PilhaGenerica<>();
        pilhaOperadores = new PilhaGenerica<>();
        scanner = new Scanner(System.in);
    }

    public void empilharValor() {
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();
        pilhaValores.empilhar(valor);
    }

    public void empilharOperador() {
        System.out.print("Digite um desses operadores: (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
            pilhaOperadores.empilhar(operador);
        } else {
            System.out.println("Operador inválido.");
        }
    }

    public void realizarCalculo() {
        if (pilhaValores.isEmpty() || pilhaValores.tamanho() < 2 || pilhaOperadores.isEmpty()) {
            System.out.println("Faltam valores ou operadores para realizar o cálculo.");
            return;
        }

        double valor2 = pilhaValores.desempilhar();
        double valor1 = pilhaValores.desempilhar();
        char operador = pilhaOperadores.desempilhar();

        double resultado;
        switch (operador) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    pilhaValores.empilhar(valor1);
                    pilhaValores.empilhar(valor2);
                    return;
                }
                resultado = valor1 / valor2;
                break;
            default:
                throw new IllegalArgumentException("Operador inválido.");
        }

        pilhaValores.empilhar(resultado);
        System.out.println("Resultado: " + resultado);
    }

    public void imprimirPilhas() {
        System.out.println("Valores na pilha:");
        while (!pilhaValores.isEmpty()) {
            System.out.println(pilhaValores.desempilhar());
        }

        System.out.println("Operadores na pilha:");
        while (!pilhaOperadores.isEmpty()) {
            System.out.println(pilhaOperadores.desempilhar());
        }
    }
}
