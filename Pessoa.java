public abstract class Pessoa {
    protected String nome;
    protected String documento;
    protected Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String documento, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

