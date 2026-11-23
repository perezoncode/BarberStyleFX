# BarberStyleFX

**Sistema Gerenciador de Barbearia**

Projeto acadêmico desenvolvido para a disciplina de **Linguagem de Programação III**, do curso de Sistemas de Informação da Universidade Federal Rural do Rio de Janeiro (UFRRJ).

**Autores:** Pedro Perez e Elias da Silva  
**Entrega:** PP1 — Primeira etapa do projeto prático  
**Linguagem:** Java  
**Interface gráfica:** JavaFX  
**Gerenciamento de dependências:** Maven

## 1. Descrição do projeto

O BarberStyleFX é um sistema de gerenciamento de barbearia desenvolvido com o objetivo de aplicar conceitos de Programação Orientada a Objetos em Java.

Nesta primeira etapa, foram implementadas funcionalidades de cadastro e consulta de clientes, barbeiros e serviços, utilizando uma interface gráfica construída com JavaFX.

## 2. Funcionalidades implementadas

### Clientes
- Cadastrar clientes com nome e telefone.
- Consultar os clientes cadastrados.
- Gerar um identificador para cada novo cliente.

### Barbeiros
- Cadastrar barbeiros com nome, telefone e valor da diária.
- Consultar os barbeiros cadastrados.
- Gerar um identificador para cada barbeiro.

### Serviços
- Cadastrar serviços com descrição, preço e duração em minutos.
- Consultar os serviços disponíveis.
- Gerar um identificador para cada serviço.

Os formulários possuem validações básicas para impedir campos vazios e valores numéricos inválidos.

## 3. Conceitos de programação utilizados

- **Classes e objetos:** representação de clientes, barbeiros, serviços e da própria barbearia.
- **Encapsulamento:** utilização de atributos privados e métodos públicos.
- **Herança:** as classes `Cliente` e `Barbeiro` herdam de `Pessoa`.
- **Abstração:** utilização da classe abstrata `Pessoa`.
- **Polimorfismo:** implementação do método `getTipo()` nas subclasses.
- **Coleções:** utilização de `ArrayList` para armazenar os cadastros.
- **Tratamento de exceções:** utilização de `try` e `catch` nos formulários.
- **Eventos:** utilização de `setOnAction()` nos botões JavaFX.

## 4. Organização das classes

| Classe | Responsabilidade |
|---|---|
| `Pessoa.java` | Classe abstrata com informações comuns de pessoas. |
| `Cliente.java` | Representa os clientes da barbearia. |
| `Barbeiro.java` | Representa os profissionais e seus valores de diária. |
| `Servico.java` | Representa os serviços, preços e durações. |
| `Barbearia.java` | Gerencia os cadastros por meio de listas e métodos. |
| `HelloApplication.java` | Implementa a interface gráfica JavaFX. |
| `Launcher.java` | Inicializa a aplicação. |

O projeto também contém arquivos de configuração do Maven e arquivos auxiliares gerados pelo IntelliJ IDEA.

## 5. Tecnologias utilizadas

- Java
- JavaFX
- Maven
- IntelliJ IDEA
- Git e GitHub

## 6. Como executar

1. Clonar ou baixar o repositório.
2. Abrir o projeto no IntelliJ IDEA.
3. Configurar um JDK compatível com o projeto.
4. Aguardar o Maven carregar as dependências JavaFX.
5. Executar a classe `Launcher.java`.

Após a inicialização, a interface apresenta três áreas principais: Clientes, Barbeiros e Serviços, cada uma com opções de cadastro e consulta.

## 7. Limitações da primeira entrega

Nesta etapa, os dados são armazenados em memória, utilizando `ArrayList`.

Isso significa que novos cadastros realizados durante a execução não são preservados após o encerramento do sistema.

O projeto também possui registros fictícios utilizados para demonstrar o funcionamento das consultas.

## 8. Próximas etapas

A continuidade do desenvolvimento prevê:

- Agendamento de atendimentos com data e horário.
- Controle de atendimentos realizados.
- Relatórios de faturamento e custos das diárias.
- Persistência em banco de dados.
- Registro de ocorrências e solicitações de reposição de materiais.

Essas funcionalidades não fazem parte da implementação apresentada nesta primeira entrega.

## 9. Autores

**Pedro Perez**  
**Elias da Silva**

Universidade Federal Rural do Rio de Janeiro — UFRRJ  
Curso de Sistemas de Informação  
Disciplina de Linguagem de Programação III

**Status:** PP1 — Primeira entrega concluída; projeto em desenvolvimento.
