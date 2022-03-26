public class Aluno extends Pessoa {
    private String matricula;
    private Disciplina disciplina;
    private int faltas;

    public Aluno() {
    }

    public Aluno(String nome, String documento, Endereco endereco) {
        super(nome, documento, endereco);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", disciplina=" + disciplina +
                ", faltas=" + faltas +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}



