package br.com.fiap.dao;

public interface IDAORegister {
	public String insertGeneral(Object obj);
	public String insertUser(Object obj);

	public String updateGeneral(Object obj);
	public String updateUser(Object obj);

	public String deleteGeneral(Integer id);
	public String deleteUser(Integer id);

	// Método "select" e "selectAll" estão sendo feitos na ClasseDAO
}
