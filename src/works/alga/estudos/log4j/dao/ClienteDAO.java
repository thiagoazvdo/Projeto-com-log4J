package works.alga.estudos.log4j.dao;

import org.apache.log4j.Logger;

import works.alga.estudos.log4j.model.Cliente;

public class ClienteDAO {

	private static Logger logger = Logger.getLogger(ClienteDAO.class);
	
	public void salvar(Cliente cliente) {
		if (cliente == null) {
			//implementacao para pedir para o usuario colocar o nome
			logger.warn("cliente digitado é nulo");
			return;
		}
		logger.debug("salvando o cliente " + cliente);	
		//implementaria o save do cliente no banco
		logger.debug("cliente salvo com sucesso.");
	}
	
}
