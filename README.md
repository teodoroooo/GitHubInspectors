GitHubInspector

GitHubInspector é uma ferramenta desenvolvida em Java para consultar informações sobre usuários no GitHub através da API pública. Com ela, você pode buscar detalhes como nome, login, bio, repositórios públicos, localização e acessar o perfil do usuário diretamente no GitHub.

🚀 Funcionalidades
✨ Principais Funcionalidades:

🔍 Consulta de Usuário: Pesquise um usuário no GitHub informando seu nome de usuário.

🖥 Exibição de Informações: Visualize as principais informações do usuário, como nome, login, bio, número de repositórios públicos e localização.

⚠️ Verificação de Erros: Caso o usuário não seja encontrado ou ocorra algum erro, a ferramenta exibirá uma mensagem de erro clara.

🌐 Integração com a API do GitHub: Utiliza a API pública do GitHub para buscar informações e exibir de forma estruturada.

🛠 Tecnologias Utilizadas
Esse projeto foi construído com as seguintes tecnologias:

🧑‍💻 Java 11+: Linguagem principal para desenvolvimento.

🌍 API do GitHub: Para consulta de dados sobre usuários.

📦 Gson: Para desserializar o JSON da resposta da API para objetos Java.

🌐 HttpClient (Java 11): Para realizar as requisições HTTP à API.

🔧 Como Rodar o Projeto
⚡️ Pré-requisitos
Antes de rodar o projeto, certifique-se de ter o Java 11 ou superior instalado em sua máquina.


Baixe o Java aqui

🏁 Passos para Execução
Clone o repositório:

bash

git clone https://github.com/seu-usuario/GitHubInspector.git
Importe o projeto na sua IDE: Abra o projeto em sua IDE favorita (IntelliJ IDEA, Eclipse, etc.).

Adicione a dependência do Gson:

Se estiver usando Maven, adicione a dependência do Gson no seu pom.xml:

xml
Copiar
Editar
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>
Se estiver usando Gradle, adicione a dependência no seu build.gradle:

gradle
Copiar
Editar
implementation 'com.google.code.gson:gson:2.8.8'
Execute o programa: Após configurar as dependências, execute o programa. O sistema pedirá para digitar o nome de usuário do GitHub:

bash
Copiar
Editar
Digite o nome do usuário do GitHub para consultar informações: 
O sistema retornará as informações do usuário no GitHub de forma formatada.

🖼 Exemplo de Execução
📋 Exemplo de Saída:

Caso o usuário seja encontrado, você verá:


bash
Copiar
Editar
Nome: Gabriel Souza
Login: gabrielsouza
Bio: Desenvolvedor Backend | Java, Spring Boot
Repositórios públicos: 10
Localização: São Paulo, Brasil
Perfil: https://github.com/gabrielsouza
Caso o usuário não seja encontrado, a mensagem será:

bash
Copiar
Editar
🚨 **Usuário não encontrado no GitHub.**
📂 Estrutura de Pastas
A estrutura do projeto é a seguinte:


⚙️ Tratamento de Erros
A aplicação conta com tratamento de erros para cenários como:

🛠 Erro de Consulta: Caso ocorra um erro durante a consulta à API, o sistema exibirá:

bash
Copiar
Editar
Opss... Houve um erro durante a consulta à API do GitHub. ❌
🚫 Usuário Não Encontrado: Se o nome de usuário não for encontrado, será exibida a mensagem:

bash
Copiar
Editar
Usuário não encontrado no GitHub. 🙅‍♂️
📝 Contribuindo
Este projeto é open-source e aceita contribuições! Se você deseja colaborar, siga estas etapas:

🍴 Faça um fork do repositório.

🌱 Crie uma nova branch para a sua feature (git checkout -b feature/nova-feature).

💻 Faça as modificações necessárias e faça um commit com uma descrição clara do que foi alterado (git commit -am 'Adicionando nova feature').

🚀 Envie o seu push para a branch criada (git push origin feature/nova-feature).

🔄 Abra um Pull Request para revisão e integração das alterações.

📄 Licença
Distribuído sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
