
public class Aluno {

    public int ra;

    public String nome;

    public String curso;

    public int idade;

    public String email;

    // metodos

    public void matricular() {
        //logica para matricular o aluno

        System.out.println("Aluno: " + nome);
        System.out.println("Foi matriculado com o RA: " + ra);

    }

    public void listar() {
        System.out.println("curso = " + curso);
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("email = " + email);

    }
}


