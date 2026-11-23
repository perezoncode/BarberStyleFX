# BarberStyleFX

### Sistema Gerenciador de Barbearia

**Universidade Federal Rural do Rio de Janeiro — UFRRJ**  
**Curso:** Sistemas de Informação  
**Disciplina:** Linguagem de Programação III  
**Integrantes:** Pedro Perez e Elias da Silva  
**Etapa:** PP1 — Primeira entrega

## Sobre o projeto

O BarberStyleFX é um sistema de gerenciamento de barbearia desenvolvido em Java, utilizando JavaFX para a construção da interface gráfica.

A proposta do projeto é facilitar a organização de informações relacionadas ao funcionamento de uma barbearia, como o cadastro de clientes, barbeiros e serviços oferecidos.

Nesta primeira etapa, nosso foco foi construir a estrutura inicial do sistema, aplicando os conceitos de Programação Orientada a Objetos estudados na disciplina e criando uma interface que permitisse realizar as operações básicas de cadastro e consulta.

## Funcionalidades desenvolvidas

Até o momento, o sistema permite cadastrar clientes, informando nome e telefone, além de consultar os registros realizados.

Também é possível cadastrar barbeiros, registrando seus dados e o valor da diária de cada profissional. Essas informações serão utilizadas futuramente para calcular os custos e o faturamento da barbearia.

Outra funcionalidade implementada é o cadastro de serviços, no qual podemos informar a descrição, o preço e a duração estimada de cada atendimento.

A interface foi organizada em três áreas principais: Clientes, Barbeiros e Serviços. Cada uma possui as opções de cadastrar e consultar, permitindo navegar pelas funcionalidades de maneira simples.

## Estrutura do código

Para organizar o projeto, dividimos as responsabilidades entre diferentes classes.

A classe `Pessoa` foi definida como abstrata e reúne informações comuns aos clientes e barbeiros. A partir dela, criamos as classes `Cliente` e `Barbeiro`, utilizando herança para reaproveitar atributos e métodos.

A classe `Servico` representa os serviços oferecidos pela barbearia, enquanto `Barbearia` é responsável pelo gerenciamento dos cadastros e consultas.

Utilizamos `ArrayList` para armazenar os objetos durante a execução e métodos específicos para adicionar e consultar os registros.

Na parte visual, utilizamos JavaFX para criar as janelas, os botões e os formulários. Também implementamos validações básicas e tratamento de exceções para lidar com dados preenchidos incorretamente.

Com essa estrutura, buscamos manter o código organizado e facilitar a implementação de novas funcionalidades nas próximas etapas.

## Tecnologias utilizadas

O sistema foi desenvolvido em Java, com interface gráfica JavaFX. Utilizamos o IntelliJ IDEA como ambiente de desenvolvimento, Maven para gerenciar as dependências e GitHub para armazenar os arquivos e acompanhar as alterações realizadas no projeto.

## Como executar

Para executar o BarberStyleFX, é necessário ter um JDK compatível com as dependências do projeto e utilizar um ambiente que permita executar aplicações JavaFX.

O projeto pode ser aberto no IntelliJ IDEA. Após o carregamento das dependências pelo Maven, basta executar a classe `Launcher.java` para iniciar a interface gráfica.

A janela principal apresenta as opções de cadastro e consulta de clientes, barbeiros e serviços.

## Limitações e próximas etapas

Nesta primeira entrega, os dados ainda são armazenados temporariamente em memória. Por isso, os novos registros não permanecem salvos após o encerramento do programa. Também utilizamos alguns dados fictícios para testar as funcionalidades desenvolvidas.

Na próxima etapa, pretendemos ampliar o sistema com o agendamento de serviços por data e horário, registro de atendimentos realizados, cálculo de faturamento e custos dos barbeiros, além da integração com banco de dados.

Também planejamos incluir um controle de ocorrências e necessidades da barbearia, permitindo registrar problemas em equipamentos, solicitações de manutenção e reposição de materiais.

Essas melhorias fazem parte da continuidade do desenvolvimento e não estão implementadas nesta primeira versão.

## Considerações finais

A primeira etapa do BarberStyleFX permitiu colocar em prática conceitos importantes de Programação Orientada a Objetos, como classes, objetos, herança, encapsulamento, abstração, métodos e coleções.

Além da implementação das funcionalidades iniciais, buscamos organizar o projeto de forma que seja possível continuar seu desenvolvimento sem precisar refazer toda a estrutura.

O BarberStyleFX permanece em desenvolvimento e será ampliado na segunda entrega da disciplina.

---

**Pedro Perez e Elias da Silva**  
Sistemas de Informação — UFRRJ  
2026
