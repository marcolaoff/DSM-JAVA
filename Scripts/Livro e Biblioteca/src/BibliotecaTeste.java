import java.util.Scanner;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.println("Digite o titulo: ");
        livro.setTitulo(sc.nextLine());
        System.out.println("Digite o nome do autor: ");
        livro.setAutor(sc.nextLine());
        System.out.println("Digite o ano de publicação: ");
        livro.setAnoPublicacao(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o preço: ");
        livro.setPreco(Double.parseDouble(sc.nextLine()));

        livro.imprimir();
    }
}