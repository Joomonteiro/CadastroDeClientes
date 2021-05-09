package cadastroFunc.jpmp.dto;

import cadastroFunc.jpmp.entity.Funcionario;
import cadastroFunc.jpmp.infra.Mapper;

public class FuncionarioViewMapper implements Mapper<Funcionario, FuncionarioView>{

	@Override
	public FuncionarioView map(Funcionario source) {
		
		return new FuncionarioView(source);
	}

	
}
