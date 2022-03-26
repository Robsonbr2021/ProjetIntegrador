public class PessoaFisica extends Pessoa{
    private double salario;

    public PessoaFisica() {
    }

    public PessoaFisica(double salario) {
        this.salario = salario;
    }

    public PessoaFisica(String nome, String documento, Endereco endereco, double salario) {
        super(nome, documento, endereco);
        this.salario = salario;
    }
}
