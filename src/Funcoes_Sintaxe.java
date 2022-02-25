import java.util.Scanner;

public class Funcoes_Sintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe tres números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        mostrarResultado(maior);

        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z){
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void mostrarResultado(int valor){
        System.out.println("Maior = " + valor);
    }
}
