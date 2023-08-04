# Este repositório contém exemplos de configuração e uso da biblioteca Log4j para geração de registros (logs) em aplicações Java.

# Exemplo: ExemploSalvandoCliente
# Este exemplo demonstra o uso do Log4j para registrar informações relacionadas à operação de salvar um cliente. A classe ExemploSalvandoCliente possui um método main que cria um cliente, salva-o usando a classe ClienteDAO e, em seguida, finaliza a aplicação.

Configuração do Log4j
Antes de executar o exemplo, é necessário configurar o Log4j. Neste projeto, há dois arquivos de configuração do Log4j:

log4j.properties: Um exemplo de configuração que imprime os logs no console.
log4jII.properties: Um exemplo de configuração que imprime os logs em um arquivo (servidor.log).