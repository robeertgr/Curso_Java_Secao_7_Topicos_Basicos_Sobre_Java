package program;

import entities.Variaveis;
import java.util.Scanner;
import static entities.Variaveis.*;

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
}
