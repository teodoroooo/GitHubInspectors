GitHubInspector
GitHubInspector é uma ferramenta simples para consultar informações sobre usuários no GitHub utilizando a API pública do GitHub. Ao fornecer o nome de usuário, o sistema retorna detalhes como nome, login, biografia, número de repositórios públicos e localização do usuário.

🚀 Funcionalidades
Consulta de Usuário no GitHub: Permite pesquisar um usuário no GitHub informando o seu nome de usuário.

Exibição de Informações: Mostra informações formatadas como nome, login, bio, repositórios públicos e localização do usuário.

Verificação de Erros: Caso o usuário não exista ou ocorra algum erro na consulta, a ferramenta exibe mensagens apropriadas de erro.

🛠 Tecnologias Utilizadas
Java 11 ou superior: Linguagem principal para desenvolvimento da aplicação.

API do GitHub: Utilizada para consultar informações sobre os usuários no GitHub.

Gson: Biblioteca usada para converter a resposta JSON da API para objetos Java.

🔧 Como Rodar o Projeto
Pré-requisitos
Java 11 ou superior instalado na sua máquina.

Gson: Biblioteca para manipulação do JSON. O Maven ou Gradle pode ser utilizado para gerenciar dependências.

Passos para Execução
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/teodoroooo/GitHubInspector.git
Importe o projeto para sua IDE: Abra o projeto no IntelliJ IDEA, Eclipse ou qualquer outra IDE de sua preferência.

Adicione a dependência do Gson:

Se estiver usando o Maven, adicione no seu pom.xml:

xml
Copiar
Editar
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
Ou, se usar o Gradle, adicione no seu build.gradle:

gradle
Copiar
Editar
implementation 'com.google.code.gson:gson:2.8.8'
Execute o Programa:

Ao rodar a aplicação, o sistema pedirá para digitar o nome de usuário do GitHub.

O programa irá consultar as informações do usuário e exibir no console.

Exemplo de Execução:

Ao rodar o código, será solicitado o nome do usuário GitHub, por exemplo:

arduino
Copiar
Editar
Digite o nome do usuário do GitHub para consultar informações: 
Se o usuário existir, as informações serão exibidas de forma formatada, como:

makefile
Copiar
Editar
Nome: Gabriel Souza
Login: gabrielsouza
Bio: Desenvolvedor Backend | Java, Spring Boot
Repositórios públicos: 10
Localização: São Paulo, Brasil
Perfil: https://github.com/gabrielsouza
Caso o usuário não seja encontrado, será exibida a mensagem:

perl
Copiar
Editar
Usuário não encontrado no GitHub.
📂 Estrutura de Pastas
bash
Copiar
Editar
GitHubInspector/
├── src/
│   └── br/
│       └── com/
│           └── githubinspector/
│               └── ConsultaGitHub.java
│               └── ErroConsultaGitHubException.java
│               └── UsuarioGitHub.java
├── pom.xml
⚙️ Tratamento de Erros
Erro de Consulta: Caso ocorra algum problema durante a consulta, será exibida a mensagem:
Opss... Houve um erro durante a consulta à API do GitHub.

Usuário Não Encontrado: Caso o nome de usuário fornecido não exista, o sistema lança uma exceção personalizada e exibe a mensagem:
Usuário não encontrado no GitHub.

📝 Contribuindo
Contribuições são bem-vindas! Se você deseja contribuir para o GitHubInspector, siga estas etapas:

Faça um fork do projeto.

Crie uma nova branch para a sua feature (git checkout -b feature/nova-feature).

Faça as modificações e commit (git commit -am 'Adicionando nova feature').

Faça o push para a branch criada (git push origin feature/nova-feature).

Abra um Pull Request para revisão.

📄 Licença
Distribuído sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

