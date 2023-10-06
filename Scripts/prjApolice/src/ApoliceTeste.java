public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.nomeSegurado = "Cleiton";
        apolice.idade = 30;
        apolice.valorPremio = 1500.00F;   //F sufixo para float - melhor usar double

        //invocar o método
        apolice.imprimir();

    }
}