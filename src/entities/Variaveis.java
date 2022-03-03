package entities;

public class Variaveis {
    public double primeiroNumero;
    public double segundoNumero;
    public int operacao;

    public static double opcao (int opcao, double primeiroNumero, double segundoNumero){
        double resultado = 0;

        switch (opcao){
            case 1:
                resultado = primeiroNumero + segundoNumero;
                break;
            case 2:
                resultado = primeiroNumero - segundoNumero;
                break;
            case 3:
                resultado = primeiroNumero * segundoNumero;
                break;
            case 4:
                resultado = primeiroNumero / segundoNumero;
                break;
            default:
                System.out.println("Opção inválida.");
        }
        return resultado;
    }

    public static void menu (){
        System.out.println("Calculadora");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("5- Sair");
        System.out.print("Escolha a operação: ");
    }

    public static void mostrarResultado (double resultado){
        System.out.printf("Resultado: %.2f\n", resultado);
        System.out.println("Fim de programa!");
    }
}
