package cadastroFunc.jpmp.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cadastroFunc.jpmp.repository.Repositorio;
import cadastroFunc.jpmp.services.funcionarioService;

public class TestaFormularioDeCadastro {
	
	private Funcionario funcionario;
	private funcionarioService funcionarioService = new funcionarioService();
	private Repositorio repositorio = new Repositorio();
	
	@Test
	public void testaCadastroDeFuncionario(){
		funcionario = new Funcionario("joao","joao12@gmail.com","55043290876","87999954536",new Endereco("55222322","Rua 1","12","Brasilia","São Paulo","São Paulo"));
		funcionarioService.cadastroDeFuncionario(funcionario);
		assertEquals("joao", repositorio .getFuncionarios().get(0).getNome());
 	}
	@Test
	public void testaListagemDeFuncionario() {
		funcionario = new Funcionario("joao","joao12@gmail.com","55043290876","87999954536",new Endereco("55222322","Rua 1","12","Brasilia","São Paulo","São Paulo"));
		funcionarioService.cadastroDeFuncionario(funcionario);
		funcionario = new Funcionario("pedro","pedro15@gmail.com","87423790654","87999574891",new Endereco("55222322","Rua 2","212","magano","São Paulo","São Paulo"));
		funcionarioService.cadastroDeFuncionario(funcionario);
		funcionario = new Funcionario("fernanda","fernanda20@gmail.com","75489201545","87999784521",new Endereco("55222322","Rua 3","523","centro","São Paulo","São Paulo"));
		funcionarioService.cadastroDeFuncionario(funcionario);
		funcionario = new Funcionario("fabiana","fabiana18@gmail.com","65872349104","879991479525",new Endereco("55222322","Rua 4","234","centro","São Paulo","São Paulo"));
		funcionarioService.cadastroDeFuncionario(funcionario);
		assertEquals(4, repositorio.getFuncionarios().size());
	}
	
	

}
