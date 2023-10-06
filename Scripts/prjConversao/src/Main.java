/**
 * @author Marco
 * @since 2023 Aug
 * Classe Main, exemplo de aula do dia 25 de agosto
 */
public class Main {
    /**
     * Método main. Iniciar o aplicativo
     * @param args
     */
    public static void main(String[] args) {
        String valor = "150";
        int qtd = 2;
        double total = qtd * Double.parseDouble(valor);
        System.out.println("Valor total: " + total);

        double x = 1500.00;
        String resultado = Double.toString(x);
        System.out.println("Resultado texto: " + resultado);
        /*
        mais que uma linha de comentário
         */

        double conta = 10 / (double) 3; // cast
        System.out.println("Conta:" + conta);
    }
}