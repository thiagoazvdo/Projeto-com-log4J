package works.alga.estudos.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {

	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();
		/*
		 * arquivo log4j.properties na pasta desse proj eh um exemplo de impressao de log no console
		 * arquivo log4jII.properties eh um exemplo de impressao de log em arquivo
		 */
		

		logger.info("começando a aplicação.");
		//.info indica o nível do log
		logger.info("finalizando a aplicação");

		/*imprime no console as informações :
		 * main - thread da execução
		 * nome do logger que definimos como o caminho da classe (linha 8)
		 * INFO - nível do log
		 */
	}

}
