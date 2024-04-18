---
# API Valorant

## Descrição
A API Valorant é um projeto desenvolvido em Spring Boot, que oferece endpoints para acessar e gerenciar dados relacionados ao jogo VALORANT. Este projeto utiliza o Maven como gerenciador de dependências e o Firebase como banco de dados.

## Requisitos
Certifique-se de ter o Java JDK e o Maven instalados em sua máquina para executar o projeto localmente. Além disso, é necessário configurar uma conta no Firebase e obter as credenciais de serviço para conectar o projeto à sua base de dados.

## Configuração
1. Clone este repositório em sua máquina local.
2. Importe o projeto em sua IDE de preferência (como IntelliJ IDEA ou Eclipse).
3. Configure as credenciais do Firebase no arquivo `application.properties`:

   ```properties
   firebase.database.url=<URL_DO_SEU_BANCO_DE_DADOS>
   firebase.credentials.path=<CAMINHO_PARA_O_ARQUIVO_JSON_DE_CREDENCIAIS>
   ```

## Endpoints Desenvolvidos.

### Jogadores
- #### GET `jlocalhost:8080/personagem`
  Retorna a lista de todos os jogadores cadastrados.

- #### GET `localhost:8080/personagem/{id}`
  Retorna os detalhes de um jogador específico com o ID fornecido.

- #### POST `localhost:8080/personagem`
  Cadastra um novo jogador. Os dados devem ser fornecidos no corpo da requisição no formato JSON.

<!-- - #### PUT `localhost:8080/personagem/{id}`
  Atualiza as informações de um jogador existente com o ID fornecido. Os novos dados devem ser fornecidos no corpo da requisição no formato JSON.-->

### Partidas
- #### GET `localhost:8080/partidas`
  Retorna a lista de todas as partidas registradas.

- #### GET `localhost:8080/partidas/{id}`
  Retorna os detalhes de uma partida específica com o ID fornecido.

- #### POST `localhost:8080/partidas`
  Registra uma nova partida. Os dados devem ser fornecidos no corpo da requisição no formato JSON.

<!-- - #### PUT `localhost:8080/partidas/{id}`
  Atualiza as informações de uma partida existente com o ID fornecido. Os novos dados devem ser fornecidos no corpo da requisição no formato JSON.-->

## Contribuição
Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões para melhorar este projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

### Contribuidores
- [Contribuidor André Felipe (ALIPE)](https://github.com/andrefelipebarros)
- [Contribuidor Rafael Sartorio](https://github.com/RafaelSartorio)
- [Contribuidor Igor Araujo](https://github.com/IGR-cK)

Esses são alguns dos incríveis colaboradores que contribuíram para o desenvolvimento deste projeto. `Se você também deseja contribuir`, sinta-se à vontade para enviar suas sugestões e melhorias `através de pull requests!`

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).

---
