public class MainADM {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 10");
        endereco.setComplemento("casa 2");
        endereco.setBairro("Casa Verde");
        System.out.println(endereco.getRua());

        PessoaFisica pessoaF = new PessoaFisica();
        pessoaF.setNome("Maria Fernanda");
        pessoaF.setDocumento("RG");
        pessoaF.setEndereco(endereco);

                System.out.println(pessoaF);

        Disciplina disciplina = new Disciplina();
        disciplina.setCurso("Química");
        disciplina.setMateria("Química Orgânica");
        disciplina.setCurso("Português");
        disciplina.setMateria("Literatura");
        System.out.println(disciplina);

        ProfessorPJ PJ = new ProfessorPJ();
        PJ.setNome("Paulo");
        PJ.setDocumento("CPF");
        PJ.setEndereco(endereco);
        PJ.setValorHora(25.00);
        PJ.setPagamento(2500.00);
        System.out.println(PJ);

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Empresa SA");
        fornecedor.setEndereco(endereco);
        fornecedor.setPagamento(3000.00);
        fornecedor.setDocumento("CGC");
       System.out.println(fornecedor);



    }
}
