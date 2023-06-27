public class AlunoGrad extends Aluno {
    String curso;

    public AlunoGrad(
        String nome, 
        String sobrenome, 
        String ra, 
        String curso) {
        super(nome, sobrenome, ra);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return
            super.toString() +
            "Nome: " + super.nome + "\n"
            + "Curso: " + curso + "\n";
    }
}
