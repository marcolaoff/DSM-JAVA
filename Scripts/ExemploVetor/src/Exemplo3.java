import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        // pedir os cinco valores para o usuario
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um número: ");
            valores[i] = Integer.parseInt(sc.nextLine());

        }
        System.out.println(valores);
    }
}
