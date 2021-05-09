package cadastroFunc.jpmp.dto;

import java.util.List;
import java.util.stream.Collectors;

import cadastroFunc.jpmp.entity.Funcionario;

public class FuncionarioView {
	
	private String nome;
	private String email;
	private String id;
	private String telefone;
	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public FuncionarioView(Funcionario funcionario) {
		this.nome = funcionario.getNome();
		this.email = funcionario.getEmail();
		this.id = funcionario.getId();
		this.telefone = funcionario.getTelefone();
		this.cep = funcionario.getCep();
		this.logradouro = funcionario.getLogradouro();
		this.numero = funcionario.getNumero();
		this.bairro = funcionario.getBairro();
		this.cidade = funcionario.getCidade();
		this.estado = funcionario.getEstado();
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
	public String getCep() {
		return cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
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
		return "FuncionarioView [nome=" + nome + ", email=" + email + ", id=" + id + ", telefone=" + telefone + ", cep="
				+ cep + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + "]";
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
