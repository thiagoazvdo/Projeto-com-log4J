package works.alga.estudos.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import works.alga.estudos.log4j.dao.ClienteDAO;
import works.alga.estudos.log4j.model.Cliente;

public class ExemploSalvandoCliente {

	private static Logger logger = Logger.getLogger(ExemploSalvandoCliente.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4jII.properties");
		
		
		logger.info("iniciando a aplicação");

		Cliente cliente = new Cliente("joão");
		new ClienteDAO().salvar(cliente);

		new ClienteDAO().salvar(null);
		
		logger.info("finalizando a aplicação.");

	}

}
