package cadastroFunc.jpmp.main;

import java.util.Scanner;

import cadastroFunc.jpmp.dto.FuncionarioForm;
import cadastroFunc.jpmp.dto.FuncionarioFormMapper;
import cadastroFunc.jpmp.dto.FuncionarioView;
import cadastroFunc.jpmp.exceptions.DomainException;
import cadastroFunc.jpmp.services.funcionarioService;

public class Main {

	public static void main(String[] args) throws DomainException{
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		String email;
		String id;
		String telefone;
		String cep;
		String logradouro;
		String numero;
		String bairro;
		String cidade;
		String estado;
		
		funcionarioService funcionarioService = new funcionarioService();
		var mapper = new FuncionarioFormMapper();
		FuncionarioForm funcionarioForm;
		
		int controle;
		int n =1;
		
		while(n != 0) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Cadastrar Funcionario");
			System.out.println("2 - Listar Funcionarios por id (CPF ou CNPJ)");
			System.out.println("3 - Deletar Funcionario do banco");
			System.out.println("0 - Sair");
			
			controle = teclado.nextInt();
			switch(controle) {
			case 1:
				System.out.println("Digite o nome do funcionario:");
				teclado.nextLine();
				nome = teclado.nextLine();
				System.out.println("Digite o email do funcionario:");
				email = teclado.nextLine();
				System.out.println("Digite o CPF ou CNPJ do funcionario:");
				id = teclado.nextLine();
				if(id.isEmpty()) {
					System.out.println("o campo não pode ser vazio");
					break;
				}else {
					System.out.println("Digite o telefone do funcionario:");
					telefone = teclado.nextLine();
					System.out.println("Digite o CEP do local em que o funcionario reside:");
					cep = teclado.nextLine();
					System.out.println("Digite o logradouro em que o funcionario reside:");
					logradouro = teclado.nextLine();
					System.out.println("Digite o numero da casa em que o funcionario reside:");
					numero = teclado.nextLine();
					System.out.println("Digite o bairro em que o funcionario reside:");
					bairro = teclado.nextLine();
					System.out.println("Digite a cidade em que o funcionario reside:");
					cidade = teclado.nextLine();
					System.out.println("Digite o estado em que o funcionario reside:");
					estado = teclado.nextLine();
					funcionarioForm = new FuncionarioForm(nome, email, id, telefone, cep, logradouro, numero, bairro, cidade, estado);
					var funcionario = mapper.map(funcionarioForm);
					funcionarioService.cadastroDeFuncionario(funcionario);
					break;
				}
			case 2:
				FuncionarioView.converte(funcionarioService.listarfuncionarios());
				break;
			case 3:
				System.out.println("Digite o CPF ou o CNPJ do item a ser removido:");
				teclado.nextLine();
				id = teclado.nextLine();
				funcionarioService.deletar(id);
				break;
			case 0:
				System.out.println("Encerrando programa");
				n = 0;
				break;
			
				
			
			
			}
			
		}
		
		teclado.close();
	}

}

