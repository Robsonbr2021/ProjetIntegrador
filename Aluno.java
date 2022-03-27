public class Aluno extends Pessoa {
    private String matricula;
    private int faltas;
    private double nota;
    private Disciplina disciplina;


    public Aluno() {
    }

    public Aluno(String matricula, int faltas, double nota, Disciplina disciplina) {
        this.matricula = matricula;
        this.faltas = faltas;
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public Aluno(String nome, String documento, Endereco endereco, String matricula, int faltas, double nota, Disciplina disciplina) {
        super(nome, documento, endereco);
        this.matricula = matricula;
        this.faltas = faltas;
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", faltas=" + faltas +
                ", nota=" + nota +
                ", disciplina=" + disciplina +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}


