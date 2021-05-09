package cadastroFunc.jpmp.dto;

import cadastroFunc.jpmp.entity.Funcionario;
import cadastroFunc.jpmp.infra.Mapper;

public class FuncionarioFormMapper implements Mapper<FuncionarioForm, Funcionario> {

	@Override
	public Funcionario map(FuncionarioForm source) {
		return new Funcionario(source.getNome(),source.getEmail(),source.getId(),source.getTelefone(),
				source.getCep(),source.getLogradouro(),source.getNumero(),source.getBairro(),source.getCidade(),
				source.getEstado());
	}

}
