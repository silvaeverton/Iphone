
# Documentação do Código Java: Iphone

## Visão Geral


O código  é um simulador de um sistema operacional para um dispositivo chamado “Iphone”. Ele oferece três funcionalidades principais: telefone, música e navegação na internet.

### Diagrama de Classes
O diagrama de classes abaixo representa a estrutura do sistema “Iphone”. Ele mostra as principais classes e suas relações:

![Iphone vpd](https://github.com/silvaeverton/Iphone/assets/168092881/35c7ec04-7b48-4c7b-8ad4-4c5a3ec871c3)

### Funcionalidades
1. **Telefone** 
* **Ligar**:Permite discar um número de telefone.
* **Atender**: Simula atender uma chamada.
* **Iniciar Correio de Voz**: Inicia o correio de voz.
* **Voltar ao Menu**:Retorna ao menu principal.
2. **Música**
* **Selecionar Música**:Permite escolher uma música para tocar.
* **Tocar**:Simula a reprodução da música selecionada.
* **Pausar**: Pausa a reprodução da música.
* **Voltar ao Menu**:Retorna ao menu principal.
3. **Navegar na Internet**
* **Acessar Página Web**:Permite inserir um endereço web e exibir a página correspondente.
* **Atualizar Aba**:Simula a atualização de uma aba do navegador.
* **Nova Aba**:Adiciona uma nova aba ao navegador.
* **Voltar ao Menu**:Retorna ao menu principal.
## Como Executar
1. Compile o código Java.
2. Execute o programa.
3. Siga as opções do menu para interagir com as funcionalidades.
## Interfaces 
### Interface ReprodutorMusica
A interface `ReprodutorMusica` contém três métodos que simulam ações relacionadas à reprodução de música:

1. `selecionarMusica(String musica)`: Permite escolher uma música para tocar. O parâmetro musica é uma string que representa o nome da música selecionada.
2. `tocar()`: Simula a reprodução da música selecionada. Este método não recebe parâmetros.
3. `pausar()`: Pausa a reprodução da música. Também não recebe parâmetros.
* Esses métodos são essenciais para a funcionalidade de música do sistema “Iphone”. Quando o usuário interage com o sistema para selecionar, tocar ou pausar uma música, esses métodos são chamados internamente para simular o comportamento esperado.
### Interface NavegadorInternet
A interface `NavegadorInternet` contém três métodos que simulam ações relacionadas à navegação na internet:

1. `atualizarAba()`: Simula a atualização de uma aba do navegador. Este método não recebe parâmetros.
2. `adicionarNovaAba()`: Adiciona uma nova aba ao navegador. Também não recebe parâmetros.
3. `exibirPagina(String url)`: Permite inserir um endereço web e exibir a página correspondente. O parâmetro url é uma string que representa o endereço da página a ser exibida.
Esses métodos são essenciais para a funcionalidade de navegação na internet do sistema “Iphone”.
* Quando o usuário interage com o sistema para atualizar uma aba, adicionar uma nova aba ou exibir uma página web, esses métodos são chamados internamente para simular o comportamento esperado.
### Interface AparelhoTelefonico
A `interface AparelhoTelefonico` contém três métodos que simulam ações relacionadas ao uso de um aparelho telefônico:

1. `atender()`: Simula a ação de atender uma chamada telefônica. Este método não recebe parâmetros.
2. `iniciarCorreioVoz()`: Inicia o correio de voz, simulando a gravação de mensagens de voz. Também não recebe parâmetros.
3.`ligar(String numero)`: Simula a ação de fazer uma ligação telefônica. O parâmetro numero é uma string que representa o  
número de telefone para o qual a ligação será feita.
* Esses métodos são essenciais para a funcionalidade do telefone no sistema “Iphone”. Quando o usuário interage com o sistema para atender uma chamada, iniciar o correio de voz ou fazer uma ligação, esses métodos são chamados internamente para simular o comportamento esperado.
  
_The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies)._
