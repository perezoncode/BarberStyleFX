
package br.ufrrj.barberstylefx;

import barberstyle.Barbearia;
import barberstyle.Cliente;
import barberstyle.Barbeiro;
import barberstyle.Servico;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private Barbearia barbearia;

    @Override
    public void start(Stage palco) {

        barbearia = new Barbearia();

        // Cadastros iniciais para teste
        barbearia.cadastrarCliente(
                new Cliente(1, "Pedro", "21999999999")
        );

        barbearia.cadastrarCliente(
                new Cliente(2, "Ana", "21988888888")
        );

        barbearia.cadastrarBarbeiro(
                new Barbeiro(1, "Carlos", "21977777777", 120.00)
        );

        barbearia.cadastrarServico(
                new Servico(1, "Corte de cabelo", 40.00, 30)
        );

        barbearia.cadastrarServico(
                new Servico(2, "Barba", 25.00, 20)
        );

        // Titulo
        Label titulo = new Label("BARBERSTYLE");
        titulo.setStyle(
                "-fx-font-size: 32px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: #D6AD62;"
        );

        Label subtitulo = new Label(
                "Sistema Gerenciador de Barbearia"
        );
        subtitulo.setStyle("-fx-text-fill: #BBBBBB;");

        // Botoes dos clientes
        Button cadastrarCliente = criarBotao("Cadastrar", true);
        Button consultarClientes = criarBotao("Consultar", false);

        cadastrarCliente.setOnAction(e -> abrirCadastroCliente());
        consultarClientes.setOnAction(e ->
                mostrar("Clientes", barbearia.listarClientes())
        );

        // Botoes dos barbeiros
        Button cadastrarBarbeiro = criarBotao("Cadastrar", true);
        Button consultarBarbeiros = criarBotao("Consultar", false);

        cadastrarBarbeiro.setOnAction(e -> abrirCadastroBarbeiro());
        consultarBarbeiros.setOnAction(e ->
                mostrar("Barbeiros", barbearia.listarBarbeiros())
        );

        // Botoes dos servicos
        Button cadastrarServico = criarBotao("Cadastrar", true);
        Button consultarServicos = criarBotao("Consultar", false);

        cadastrarServico.setOnAction(e -> abrirCadastroServico());
        consultarServicos.setOnAction(e ->
                mostrar("Servicos", barbearia.listarServicos())
        );

        // Organizacao das tres areas
        VBox areaClientes = criarArea(
                "CLIENTES",
                "Cadastro e consulta de clientes",
                cadastrarCliente,
                consultarClientes
        );

        VBox areaBarbeiros = criarArea(
                "BARBEIROS",
                "Gerenciamento dos profissionais",
                cadastrarBarbeiro,
                consultarBarbeiros
        );

        VBox areaServicos = criarArea(
                "SERVICOS",
                "Precos e duracao dos servicos",
                cadastrarServico,
                consultarServicos
        );

        HBox areas = new HBox(20);
        areas.setAlignment(Pos.CENTER);
        areas.getChildren().addAll(
                areaClientes, areaBarbeiros, areaServicos
        );

        VBox layout = new VBox(25);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(30));
        layout.setStyle("-fx-background-color: #111318;");

        layout.getChildren().addAll(
                titulo, subtitulo, areas
        );

        Scene cena = new Scene(layout, 950, 500);

        palco.setTitle("BarberStyle");
        palco.setScene(cena);
        palco.show();
    }

    // Criacao dos botoes
    private Button criarBotao(String texto, boolean principal) {

        Button botao = new Button(texto);
        botao.setPrefWidth(210);
        botao.setPrefHeight(40);

        if (principal) {
            botao.setStyle(
                    "-fx-background-color: #D6AD62;" +
                            "-fx-text-fill: #111111;" +
                            "-fx-font-weight: bold;" +
                            "-fx-background-radius: 7;"
            );
        } else {
            botao.setStyle(
                    "-fx-background-color: #303238;" +
                            "-fx-text-fill: white;" +
                            "-fx-background-radius: 7;"
            );
        }

        return botao;
    }

    // Criacao das areas do menu
    private VBox criarArea(String titulo, String descricao,
                           Button cadastrar, Button consultar) {

        Label nome = new Label(titulo);
        nome.setStyle(
                "-fx-text-fill: #D6AD62;" +
                        "-fx-font-size: 19px;" +
                        "-fx-font-weight: bold;"
        );

        Label detalhe = new Label(descricao);
        detalhe.setWrapText(true);
        detalhe.setAlignment(Pos.CENTER);
        detalhe.setMaxWidth(210);
        detalhe.setStyle("-fx-text-fill: #BBBBBB;");

        VBox area = new VBox(18);
        area.setAlignment(Pos.CENTER);
        area.setPadding(new Insets(25));
        area.setPrefWidth(280);
        area.setPrefHeight(260);

        area.setStyle(
                "-fx-background-color: #202329;" +
                        "-fx-background-radius: 12;" +
                        "-fx-border-color: #665333;" +
                        "-fx-border-radius: 12;"
        );

        area.getChildren().addAll(
                nome, detalhe, cadastrar, consultar
        );

        return area;
    }

    // Cadastro de clientes
    private void abrirCadastroCliente() {

        Stage janela = new Stage();

        TextField nome = new TextField();
        nome.setPromptText("Nome do cliente");

        TextField telefone = new TextField();
        telefone.setPromptText("Telefone");

        Button salvar = criarBotao("Salvar Cliente", true);

        salvar.setOnAction(e -> {

            String nomeCliente = nome.getText().trim();
            String telefoneCliente = telefone.getText().trim();

            if (nomeCliente.isEmpty() || telefoneCliente.isEmpty()) {
                mostrar("Atencao", "Preencha todos os campos.");
                return;
            }

            int id = barbearia.proximoIdCliente();

            Cliente cliente = new Cliente(
                    id, nomeCliente, telefoneCliente
            );

            barbearia.cadastrarCliente(cliente);

            mostrar("Cadastro", "Cliente cadastrado com sucesso!");
            janela.close();
        });

        abrirFormulario(janela, "CADASTRAR CLIENTE",
                nome, telefone, salvar);
    }

    // Cadastro de barbeiros
    private void abrirCadastroBarbeiro() {

        Stage janela = new Stage();

        TextField nome = new TextField();
        nome.setPromptText("Nome do barbeiro");

        TextField telefone = new TextField();
        telefone.setPromptText("Telefone");

        TextField diaria = new TextField();
        diaria.setPromptText("Valor da diaria");

        Button salvar = criarBotao("Salvar Barbeiro", true);

        salvar.setOnAction(e -> {

            String nomeBarbeiro = nome.getText().trim();
            String telefoneBarbeiro = telefone.getText().trim();

            if (nomeBarbeiro.isEmpty() || telefoneBarbeiro.isEmpty()
                    || diaria.getText().trim().isEmpty()) {

                mostrar("Atencao", "Preencha todos os campos.");
                return;
            }

            try {

                double valor = Double.parseDouble(
                        diaria.getText().trim().replace(",", ".")
                );

                if (!Double.isFinite(valor) || valor < 0) {
                    mostrar("Erro", "Valor da diaria invalido.");
                    return;
                }

                int id = barbearia.proximoIdBarbeiro();

                Barbeiro barbeiro = new Barbeiro(
                        id, nomeBarbeiro, telefoneBarbeiro, valor
                );

                barbearia.cadastrarBarbeiro(barbeiro);

                mostrar("Cadastro", "Barbeiro cadastrado com sucesso!");
                janela.close();

            } catch (NumberFormatException erro) {
                mostrar("Erro", "Digite um valor numerico valido.");
            }
        });

        abrirFormulario(janela, "CADASTRAR BARBEIRO",
                nome, telefone, diaria, salvar);
    }

    // Cadastro de servicos
    private void abrirCadastroServico() {

        Stage janela = new Stage();

        TextField descricao = new TextField();
        descricao.setPromptText("Descricao do servico");

        TextField preco = new TextField();
        preco.setPromptText("Preco do servico");

        TextField duracao = new TextField();
        duracao.setPromptText("Duracao em minutos");

        Button salvar = criarBotao("Salvar Servico", true);

        salvar.setOnAction(e -> {

            String nomeServico = descricao.getText().trim();

            if (nomeServico.isEmpty() ||
                    preco.getText().trim().isEmpty() ||
                    duracao.getText().trim().isEmpty()) {

                mostrar("Atencao", "Preencha todos os campos.");
                return;
            }

            try {

                double valor = Double.parseDouble(
                        preco.getText().trim().replace(",", ".")
                );

                int minutos = Integer.parseInt(
                        duracao.getText().trim()
                );

                if (!Double.isFinite(valor) ||
                        valor <= 0 || minutos <= 0) {

                    mostrar("Erro", "Valores invalidos.");
                    return;
                }

                int id = barbearia.proximoIdServico();

                Servico servico = new Servico(
                        id, nomeServico, valor, minutos
                );

                barbearia.cadastrarServico(servico);

                mostrar("Cadastro", "Servico cadastrado com sucesso!");
                janela.close();

            } catch (NumberFormatException erro) {
                mostrar("Erro", "Digite valores numericos validos.");
            }
        });

        abrirFormulario(janela, "CADASTRAR SERVICO",
                descricao, preco, duracao, salvar);
    }

    // Janela padrao dos formularios
    private void abrirFormulario(Stage janela, String titulo,
                                 Node... campos) {

        Label cabecalho = new Label(titulo);
        cabecalho.setStyle(
                "-fx-font-size: 20px;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: #D6AD62;"
        );

        VBox layout = new VBox(15);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(25));
        layout.setStyle("-fx-background-color: #202329;");

        layout.getChildren().add(cabecalho);
        layout.getChildren().addAll(campos);

        Scene cena = new Scene(layout, 390, 350);

        janela.setTitle("BarberStyle - " + titulo);
        janela.setScene(cena);
        janela.show();
    }

    // Mensagens do sistema
    private void mostrar(String titulo, String texto) {

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("BarberStyle");
        alerta.setHeaderText(titulo);
        alerta.setContentText(texto);
        alerta.showAndWait();
    }
}
