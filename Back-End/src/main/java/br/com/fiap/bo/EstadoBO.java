package br.com.fiap.bo;

import java.util.ArrayList;

import br.com.fiap.dao.EstadoDAO;
import br.com.fiap.to.EstadoTO;

public class EstadoBO {
	
	private EstadoDAO ed;
	

	public String cadastrar(EstadoTO et) {

		ed = new EstadoDAO();

		// Regras de negócio
		if (et != null) {
			return ed.insert(et);
		}

		return null;
	}
	

	public void atualizar(EstadoTO et) {

		ed = new EstadoDAO();

		// Regras de negócio
		ed.update(et);
	}
	

	public void remover(Integer id) {

		ed = new EstadoDAO();

		// Regras de negócio
		ed.delete(id);
	}
	

	public ArrayList<EstadoTO> listar(Integer id) {

		ArrayList<EstadoTO> resultado = null;

		ed = new EstadoDAO();

		// Regras de negócio
		if (id != null) {
			resultado = ed.select(id);
		}

		return resultado;
	}
	

	public ArrayList<EstadoTO> listarTodos() {

		ed = new EstadoDAO();

		// Regras de negócio
		return ed.selectAll();
	}
}
