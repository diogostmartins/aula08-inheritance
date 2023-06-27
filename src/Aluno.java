public class Aluno {
    protected String nome;
    protected String sobrenome;
    protected String ra;

    public Aluno(String nome, String sobrenome, String ra) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
    }

    @Override
    public String toString() {
        return
            "Nome: " + nome + "\n"
            + "Sobrenome: " + sobrenome + "\n"
            + "RA: " + ra + "\n";
    }
}
