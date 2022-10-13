package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioRegistroGeralTO {

	private int idRegistroGeral;
	private String tipoUsuario;
	private String nomeCompleto;
	private String email;
	private String senha;
	private String cpf; // Irá passar pela formatação e pelo mask no front-end, por isso "String"

	public UsuarioRegistroGeralTO() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioRegistroGeralTO(int idRegistroGeral, String tipoUsuario, String nomeCompleto, String email,
			String senha, String cpf) {
		super();
		this.idRegistroGeral = idRegistroGeral;
		this.tipoUsuario = tipoUsuario;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}

	public int getIdRegistroGeral() {
		return idRegistroGeral;
	}

	public void setIdRegistroGeral(int idRegistroGeral) {
		this.idRegistroGeral = idRegistroGeral;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}