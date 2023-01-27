package works.alga.estudos.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {

	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();
		/*o basic configurator eh bem simples e está sendo usado apenas para fins didáticos
		 * geralmente no mercado de trabalho sao usadas outras classes que geram arquivos
		 * ao inves de imprimir no console como eh o caso desse exemplo
		 */
		

		logger.info("começando a aplicação.");
		logger.info("finalizando a aplicação");

		/*imprime no console as informações :
		 * main - thread da execução
		 * nome do logger que definimos como o caminho da classe (linha 8)
		 * INFO - nível do log
		 */
	}

}
