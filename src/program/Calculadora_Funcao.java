package program;

import entities.Variaveis;

import java.util.Scanner;

public class Calculadora_Funcao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Variaveis receber;
        receber = new Variaveis();

        menu();
        receber.operacao = sc.nextInt();
        System.out.print("Primeiro número: ");
        receber.primeiroNumero = sc.nextDouble();
        System.out.print("Segundo número: ");
        receber.segundoNumero = sc.nextDouble();

        double resultado = opcao(receber.operacao, receber.primeiroNumero, receber.segundoNumero);
        mostrarResultado(resultado);

        sc.close();
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

    public static void mostrarResultado (double resultado){
        System.out.printf("Resultado: %.2f\n", resultado);
        System.out.println("Fim de programa!");
    }
}
