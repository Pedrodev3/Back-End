package br.com.fiap.to;

import java.sql.Blob;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RegistroCandidatoTO extends UsuarioRegistroGeralTO {
	private String nrRg;
	private LocalDate dtNascimento;
	private String flSexoBiologico;
	private String tpEscolaridade;
	private String dsEstadoCivil;
	private String dsCargo;
	private Blob dsFoto;

	public RegistroCandidatoTO() {
		// TODO Auto-generated constructor stub
	}

	public RegistroCandidatoTO(Integer idRegistroGeral, String tipoUsuario, String nomeCompleto, String email,
			String senha, String cpf, String nrRg, LocalDate dtNascimento, String flSexoBiologico,
			String tpEscolaridade, String dsEstadoCivil, String dsCargo, Blob dsFoto) {
		super.setIdRegistroGeral(idRegistroGeral);
		super.setTipoUsuario(tipoUsuario);
		super.setNomeCompleto(nomeCompleto);
		super.setEmail(email);
		super.setSenha(senha);
		super.setCpf(cpf);
		this.nrRg = nrRg;
		this.dtNascimento = dtNascimento;
		this.flSexoBiologico = flSexoBiologico;
		this.tpEscolaridade = tpEscolaridade;
		this.dsEstadoCivil = dsEstadoCivil;
		this.dsCargo = dsCargo;
		this.dsFoto = dsFoto;
	}

	public String getNrRg() {
		return nrRg;
	}

	public void setNrRg(String nrRg) {
		this.nrRg = nrRg;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getFlSexoBiologico() {
		return flSexoBiologico;
	}

	public void setFlSexoBiologico(String flSexoBiologico) {
		this.flSexoBiologico = flSexoBiologico;
	}

	public String getTpEscolaridade() {
		return tpEscolaridade;
	}

	public void setTpEscolaridade(String tpEscolaridade) {
		this.tpEscolaridade = tpEscolaridade;
	}

	public String getDsEstadoCivil() {
		return dsEstadoCivil;
	}

	public void setDsEstadoCivil(String dsEstadoCivil) {
		this.dsEstadoCivil = dsEstadoCivil;
	}

	public String getDsCargo() {
		return dsCargo;
	}

	public void setDsCargo(String dsCargo) {
		this.dsCargo = dsCargo;
	}

	public Blob getDsFoto() {
		return dsFoto;
	}

	public void setDsFoto(Blob dsFoto) {
		this.dsFoto = dsFoto;
	}

}