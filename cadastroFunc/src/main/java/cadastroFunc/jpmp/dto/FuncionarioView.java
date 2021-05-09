package cadastroFunc.jpmp.dto;

import java.util.List;
import java.util.stream.Collectors;

import cadastroFunc.jpmp.entity.Endereco;
import cadastroFunc.jpmp.entity.Funcionario;

public class FuncionarioView {
	
	private String nome;
	private String email;
	private String id;
	private String telefone;
	private String enderecoCep;
	private String enderecoLogradouro;
	private String enderecoNumero;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoEstado;
	
	public FuncionarioView(Funcionario funcionario) {
		this.nome = funcionario.getNome();
		this.email = funcionario.getEmail();
		this.id = funcionario.getId();
		this.telefone = funcionario.getTelefone();
		this.enderecoCep = funcionario.getEndereco().getCep();
		this.enderecoLogradouro = funcionario.getEndereco().getLogradouro();
		this.enderecoNumero = funcionario.getEndereco().getNumero();
		this.enderecoBairro = funcionario.getEndereco().getBairro();
		this.enderecoCidade = funcionario.getEndereco().getCidade();
		this.enderecoEstado = funcionario.getEndereco().getEstado();
	}
	
	

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}

	public String getEnderecoNumero() {
		return enderecoNumero;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public String getEnderecoEstado() {
		return enderecoEstado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((enderecoBairro == null) ? 0 : enderecoBairro.hashCode());
		result = prime * result + ((enderecoCep == null) ? 0 : enderecoCep.hashCode());
		result = prime * result + ((enderecoCidade == null) ? 0 : enderecoCidade.hashCode());
		result = prime * result + ((enderecoEstado == null) ? 0 : enderecoEstado.hashCode());
		result = prime * result + ((enderecoLogradouro == null) ? 0 : enderecoLogradouro.hashCode());
		result = prime * result + ((enderecoNumero == null) ? 0 : enderecoNumero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioView other = (FuncionarioView) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enderecoBairro == null) {
			if (other.enderecoBairro != null)
				return false;
		} else if (!enderecoBairro.equals(other.enderecoBairro))
			return false;
		if (enderecoCep == null) {
			if (other.enderecoCep != null)
				return false;
		} else if (!enderecoCep.equals(other.enderecoCep))
			return false;
		if (enderecoCidade == null) {
			if (other.enderecoCidade != null)
				return false;
		} else if (!enderecoCidade.equals(other.enderecoCidade))
			return false;
		if (enderecoEstado == null) {
			if (other.enderecoEstado != null)
				return false;
		} else if (!enderecoEstado.equals(other.enderecoEstado))
			return false;
		if (enderecoLogradouro == null) {
			if (other.enderecoLogradouro != null)
				return false;
		} else if (!enderecoLogradouro.equals(other.enderecoLogradouro))
			return false;
		if (enderecoNumero == null) {
			if (other.enderecoNumero != null)
				return false;
		} else if (!enderecoNumero.equals(other.enderecoNumero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}
	
	


	@Override
	public String toString() {
		return "FuncionarioView [nome=" + nome + ", email=" + email + ", id=" + id + ", telefone=" + telefone
				+ ", enderecoCep=" + enderecoCep + ", enderecoLogradouro=" + enderecoLogradouro + ", enderecoNumero="
				+ enderecoNumero + ", enderecoBairro=" + enderecoBairro + ", enderecoCidade=" + enderecoCidade
				+ ", enderecoEstado=" + enderecoEstado + "]";
	}



	public static List<FuncionarioView> converte(List<Funcionario> listarFuncionairos) {
		List<FuncionarioView> funcionariosView = listarFuncionairos.stream().map(FuncionarioView::new).collect(Collectors.toList());
		if(funcionariosView.size()>0) {
			for (FuncionarioView funcionarioView : funcionariosView) {
				System.out.println(funcionarioView);
			}
		}else {
			System.out.println("Não há funcionarios cadastrados");
		}
		return funcionariosView;
	}
	
//	public void listarfuncionarios(List<Funcionario> listarFuncionairos) {
//		List<FuncionarioView> lista = FuncionarioView.converte(listarFuncionairos);
//		for (FuncionarioView funcionarioView : lista) {
//			System.out.println(funcionarioView);
//		}
//	}
	
	public FuncionarioView converte(Funcionario funcionario) {
		return new FuncionarioView(funcionario);
	}
}
