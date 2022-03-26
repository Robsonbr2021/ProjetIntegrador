public class PessoaJuridica extends Pessoa{
    private double valorHora;
    private double quantidade;
    private double pagamento;

    public PessoaJuridica(){

    }

    public PessoaJuridica(double valorHora, double pagamento) {
        this.valorHora = valorHora;
        this.pagamento = pagamento;
    }

    public PessoaJuridica(String nome, String documento, Endereco endereco, double valorHora, double pagamento) {
        super(nome, documento, endereco);
        this.valorHora = valorHora;
        this.pagamento = pagamento;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", valorHora=" + valorHora +
                ", pagamento=" + pagamento +
                '}';
    }
}

