package br.com.fiap.bo;

import java.util.ArrayList;

import br.com.fiap.dao.RegistroCandidatoDAO;
import br.com.fiap.to.RegistroCandidatoTO;


public class RegistroCandidatoBO {
	
	private RegistroCandidatoDAO rcd;
	
public String cadastrar(RegistroCandidatoTO rct) {
		
		String resultado1 = null;
		String resultado2 = null;
		String resultado3 = null;
		
		rcd = new RegistroCandidatoDAO();
		
		resultado1 = rcd.insertGeneral(rct);
		resultado2 = rcd.insertUser(rct);
		
		//Regra de negócio
		if(resultado1 == "Inserido com sucesso." && resultado2 == "Inserido com sucesso.") {
			resultado3 = "Enviado com sucesso.";
		} else {
			resultado3 = "Erro ao inserir";
		}
		
		return resultado3;
	}

	
	public String atualizar(RegistroCandidatoTO rct) {

		String resultado1 = null;
		String resultado2 = null;
		String resultado3 = null;
		
		rcd = new RegistroCandidatoDAO();
		
		resultado1 = rcd.updateGeneral(rct);
		resultado2 = rcd.updateUser(rct);
		
		//Regra de negócio
		if(resultado1 == "Alterado com sucesso!" && resultado2 == "Alterado com sucesso!") {
			resultado3 = "Atualizado com sucesso.";
		} else {
			resultado3 = "Erro ao atualizar.";
		}
		
		return resultado3;
		
	}

	
	public String remover(Integer id) {

		String resultado1 = null;
		String resultado2 = null;
		String resultado3 = null;
		
		rcd = new RegistroCandidatoDAO();
		
		resultado1 = rcd.deleteGeneral(id);
		resultado2 = rcd.deleteUser(id);
		
		//Regra de negócio
		if(resultado1 == "Excluido com sucesso!" && resultado2 == "Excluido com sucesso!") {
			resultado3 = "Deletado com sucesso.";
		} else {
			resultado3 = "Erro ao deletar.";
		}
		
		return resultado3;
	}

	
	public ArrayList<RegistroCandidatoTO> listar(Integer id) {

		rcd = new RegistroCandidatoDAO();
		
		//Regra de negócio
		if (id != null) {
			return rcd.select(id);
		}
		
		return null;
	}

	
	public ArrayList<RegistroCandidatoTO> listarTodos() {

		rcd = new RegistroCandidatoDAO();

		return rcd.selectAll();
	}
}
