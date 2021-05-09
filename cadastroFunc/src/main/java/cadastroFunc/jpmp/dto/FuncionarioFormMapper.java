package cadastroFunc.jpmp.dto;

import cadastroFunc.jpmp.entity.Endereco;
import cadastroFunc.jpmp.entity.Funcionario;
import cadastroFunc.jpmp.infra.Mapper;

public class FuncionarioFormMapper implements Mapper<FuncionarioForm, Funcionario> {

	@Override
	public Funcionario map(FuncionarioForm source) {
		return new Funcionario(source.getNome(),source.getEmail(),source.getId(),source.getTelefone(),
				new Endereco(source.getEnderecoCep(),source.getEnderecoLogradouro(),source.getEnderecoNumero(),source.getEnderecoBairro(),source.getEnderecoCidade(),
						source.getEnderecoEstado()));
	}

}
