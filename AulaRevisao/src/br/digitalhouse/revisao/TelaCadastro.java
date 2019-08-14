package br.digitalhouse.revisao;

public class TelaCadastro {

    public static void main(String[] args) {

        Data novaData = new Data(10,8,2019);

        Cliente novoCliente = new Cliente("Camila",novaData, 234);

        novoCliente.imprimeDados();

        Funcionario novoFuncionario = new Funcionario("Maria", novaData, 2347);
        novoFuncionario.calculaImposto();
        novoFuncionario.imprimeDados();

        System.out.println("***********************************************************************");

        Gerente novoGerente = new Gerente("João",novaData,213,"teste");
        novoGerente.calculaImposto();
        novoGerente.imprimeDados();

        System.out.println("***********************************************************************");

        CadastroPessoas novoCadastro = new CadastroPessoas();
        novoCadastro.cadastrarPessoa(novoCliente);
        novoCadastro.cadastrarPessoa(novoFuncionario);
        novoCadastro.cadastrarPessoa(novoGerente);
        novoCadastro.imprimeCadastro();
    }
}
