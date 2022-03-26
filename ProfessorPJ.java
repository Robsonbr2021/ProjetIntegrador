public class ProfessorPJ extends PessoaJuridica{

    private Disciplina disciplina;
    private Endereco endereco;

    public ProfessorPJ(){

    }

    public ProfessorPJ(Disciplina disciplina, Endereco endereco) {
        this.disciplina = disciplina;
        this.endereco = endereco;
    }

    public ProfessorPJ(double valorHora, double pagamento, Disciplina disciplina, Endereco endereco) {
        super(valorHora, pagamento);
        this.disciplina = disciplina;
        this.endereco = endereco;
    }

    public ProfessorPJ(String nome, String documento, Endereco endereco, double valorHora, double pagamento, Disciplina disciplina, Endereco endereco1) {
        super(nome, documento, endereco, valorHora, pagamento);
        this.disciplina = disciplina;
        this.endereco = endereco1;
    }
}

