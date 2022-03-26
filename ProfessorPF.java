public class ProfessorPF extends Pessoa{
    private Disciplina disciplina;
    private PessoaFisica pessoaFisica;

    public ProfessorPF(Disciplina disciplina, PessoaFisica pessoaFisica) {
        this.disciplina = disciplina;
        this.pessoaFisica = pessoaFisica;
    }

    public ProfessorPF(String nome, String documento, Endereco endereco, Disciplina disciplina, PessoaFisica pessoaFisica) {
        super(nome, documento, endereco);
        this.disciplina = disciplina;
        this.pessoaFisica = pessoaFisica;
    }
}
