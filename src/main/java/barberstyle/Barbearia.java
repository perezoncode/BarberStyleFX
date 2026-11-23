
package barberstyle;

import java.util.ArrayList;

public class Barbearia {

    private ArrayList<Cliente> clientes;
    private ArrayList<Barbeiro> barbeiros;
    private ArrayList<Servico> servicos;

    public Barbearia() {
        clientes = new ArrayList<>();
        barbeiros = new ArrayList<>();
        servicos = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarBarbeiro(Barbeiro barbeiro) {
        barbeiros.add(barbeiro);
    }

    public void cadastrarServico(Servico servico) {
        servicos.add(servico);
    }

    public void mostrarClientes() {
        System.out.println("=== CLIENTES CADASTRADOS ===");

        for (Cliente cliente : clientes) {
            System.out.println(
                    cliente.getId() + " - " + cliente.getNome()
            );
        }
    }

    public void mostrarBarbeiros() {
        System.out.println("=== BARBEIROS CADASTRADOS ===");

        for (Barbeiro barbeiro : barbeiros) {
            System.out.println(
                    barbeiro.getId() + " - " + barbeiro.getNome()
                            + " | Diaria: R$ " + barbeiro.getValorDiaria()
            );
        }
    }

    public void mostrarServicos() {
        System.out.println("=== SERVICOS CADASTRADOS ===");

        for (Servico servico : servicos) {
            System.out.println(
                    servico.getId() + " - " + servico.getDescricao()
                            + " | R$ " + servico.getPreco()
            );
        }
    }

    public String listarClientes() {

        String texto = "CLIENTES CADASTRADOS:\n";

        for (Cliente cliente : clientes) {
            texto += cliente.getId() + " - "
                    + cliente.getNome() + "\n";
        }

        return texto;
    }

    public String listarBarbeiros() {

        String texto = "BARBEIROS CADASTRADOS:\n";

        for (Barbeiro barbeiro : barbeiros) {
            texto += barbeiro.getId() + " - "
                    + barbeiro.getNome() + "\n";
        }

        return texto;
    }

    public String listarServicos() {

        String texto = "SERVICOS CADASTRADOS:\n";

        for (Servico servico : servicos) {
            texto += servico.getId() + " - "
                    + servico.getDescricao() + "\n";
        }

        return texto;
    }

    public int proximoIdCliente() {

        int maiorId = 0;

        for (Cliente cliente : clientes) {
            if (cliente.getId() > maiorId) {
                maiorId = cliente.getId();
            }
        }

        return maiorId + 1;
    }

    public int proximoIdBarbeiro() {

        int maiorId = 0;

        for (Barbeiro barbeiro : barbeiros) {

            if (barbeiro.getId() > maiorId) {
                maiorId = barbeiro.getId();
            }
        }

        return maiorId + 1;
    }

    public int proximoIdServico() {

        int maiorId = 0;

        for (Servico servico : servicos) {

            if (servico.getId() > maiorId) {
                maiorId = servico.getId();
            }
        }

        return maiorId + 1;
    }

}
