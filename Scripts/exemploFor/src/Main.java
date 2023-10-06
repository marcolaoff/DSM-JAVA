public class Main {
    public static void main(String[] args) {
        //Fazer uma contagem de 1 a 10

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue; // só imprimi os impar
            /*
            if(i % 3 == 0) continue; só imprimi os pares
             */
            System.out.println(i);
        }

        int soma = 0;
        do {
            soma += 3;
        }
            }while (soma < 100)

        System.out.println("Valor final: " + soma);
    }
}