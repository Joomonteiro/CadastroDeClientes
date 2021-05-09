package cadastroFunc.jpmp.services;

import java.util.ArrayList;
import java.util.List;

import cadastroFunc.jpmp.Main;
import cadastroFunc.jpmp.entity.Funcionario;
import cadastroFunc.jpmp.exceptions.DomainException;
import cadastroFunc.jpmp.repository.Repositorio;

public class funcionarioService {
	
	private Repositorio repositorio = new Repositorio();
	
	public void cadastroDeFuncionario(Funcionario funcionario) {
		repositorio.salvar(funcionario);
	}
	public List<Funcionario> listarfuncionarios() {
		return repositorio.listarfuncionarios();
	}
	public void deletar(String id) {
		if (repositorio.getFuncionarios().size()>0) {
			try {
				repositorio.deletar(id);
			} catch (DomainException e) {
				e.printStackTrace();
			}
		}else {
			
			System.out.println("Ainda não há funcionarios cadastrados");
		}
		
		
	}
}

