import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 -> Empilhar valor");
            System.out.println("2 -> Empilhar operador");
            System.out.println("3 -> Realizar cálculo");
            System.out.println("4 -> Imprimir pilhas");
            System.out.println("0 -> Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calculadora.empilharValor();
                    break;
                case 2:
                    calculadora.empilharOperador();
                    break;
                case 3:
                    calculadora.realizarCalculo();
                    break;
                case 4:
                    calculadora.imprimirPilhas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}
