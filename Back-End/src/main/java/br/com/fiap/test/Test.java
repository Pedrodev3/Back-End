package br.com.fiap.test;

import br.com.fiap.bo.EstadoBO;
import br.com.fiap.dao.EstadoDAO;
import br.com.fiap.dao.RegistroRecrutadorDAO;
import br.com.fiap.to.RegistroRecrutadorTO;
import br.com.fiap.to.EstadoTO;
import br.com.fiap.to.RegistroRecrutadorTO;

public class Test {

	public static void main(String[] args) {
//		RegistroRecrutadorDAO rrd = new RegistroRecrutadorDAO();
//		RegistroRecrutadorTO rrt = new RegistroRecrutadorTO();
//		
//		rrt.setNomeCompleto("Bill");
//		rrt.setSenha("1234bill");
//		rrt.setEmail("bill@gmail.com");
//		rrt.setCpf("143.431.756-35");
//		rrt.setNomeEmpresa("Bora Bill");
//		rrt.setDescricaoCargo("Recrutador");
//		
//		System.out.println(rrd.insertGeneral(rrt));
//		System.out.println(rrd.insertRecruiter(rrt));
		
		EstadoDAO ed = new EstadoDAO();
		EstadoTO et = new EstadoTO();
		EstadoBO eb = new EstadoBO();
		
		et.setSgEstado("CC");
		et.setNmEstado("Conchina");
		
		
		
		
		System.out.println(eb.cadastrar(et));
		
//		System.out.println(ed.insert(et));
//		System.out.println(ed.delete(et));
		
		
	}

}
