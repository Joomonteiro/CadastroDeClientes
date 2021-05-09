package cadastroFunc.jpmp.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cadastroFunc.jpmp.entity.Funcionario;
import cadastroFunc.jpmp.exceptions.DomainException;

public class Repositorio {

	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public List<Funcionario> getFuncionarios() {
		return Collections.unmodifiableList(funcionarios);
	}
	public void salvar(Funcionario funcionario) {
		funcionarios.add(funcionario);		
	}
	public List<Funcionario> listarfuncionarios() {
		return Collections.unmodifiableList(funcionarios);
	}
	public void deletar(String id) throws DomainException {
		for (Funcionario funcionario : funcionarios) {
			if(id.equals(funcionario.getId())) {
				funcionarios.remove(funcionario);
				System.out.println("Funcionario Removido com sucesso!");
				break;
			}
			else {
				throw new DomainException("ErrR04 - Funcionario não encontrado!");
			}
		}
		
	}
}
