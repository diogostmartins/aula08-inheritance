public class AlunoPos extends Aluno {
    String orientador;
    String programa;

    public AlunoPos(
        String orientador, 
        String programa, 
        String nome, 
        String sobrenome, 
        String ra) {
        super(nome, sobrenome, ra);
        this.orientador = orientador;
        this.programa = programa;
    }

    @Override
    public String toString() {
        return super.toString()
            + "Orientador: " + orientador + "\n"
            + "Programa: " + programa + "\n";
    }
}
