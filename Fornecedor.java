public class Fornecedor extends PessoaJuridica{
    private String produto;
    private Endereco endereco;

    public Fornecedor(){
    }

    public Fornecedor(double valorHora, double pagamento, String produto, Endereco endereco) {
        super(valorHora, pagamento);
        this.produto = produto;
        this.endereco = endereco;
    }

    public Fornecedor(String nome, String documento, Endereco endereco, double valorHora, double pagamento, String produto, Endereco endereco1) {
        super(nome, documento, endereco, valorHora, pagamento);
        this.produto = produto;
        this.endereco = endereco1;
    }
}


