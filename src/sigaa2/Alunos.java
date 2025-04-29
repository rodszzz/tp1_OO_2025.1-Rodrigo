package sigaa2;

public class Alunos {
    private String nome;
    private int matricula;

    void darOi() {
        System.out.println(nome + ", da matrícula " + matricula + ", te disse oi!\n");
    }

    void setNome(String nomeAluno) {
        nome = nomeAluno;
    }

    void setMatricula(int matriculaAluno) {
        matricula = matriculaAluno;
    }
}
