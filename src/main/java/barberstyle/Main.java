
package barberstyle;

public class Main {

    public static void main(String[] args) {

        Barbearia barbearia = new Barbearia();

        barbearia.cadastrarCliente(
                new Cliente(1, "Pedro", "21999999999")
        );

        barbearia.cadastrarCliente(
                new Cliente(2, "Ana", "21988888888")
        );

        barbearia.cadastrarCliente(
                new Cliente(3, "Lucas", "21977777777")
        );

        barbearia.cadastrarBarbeiro(
                new Barbeiro(1, "Carlos", "21988888888", 120.00)
        );

        barbearia.cadastrarBarbeiro(
                new Barbeiro(2, "Rafael", "21977777777", 150.00)
        );

        barbearia.cadastrarServico(
                new Servico(1, "Corte de cabelo", 40.00, 30)
        );

        barbearia.cadastrarServico(
                new Servico(2, "Barba", 25.00, 20)
        );

        barbearia.mostrarClientes();
        System.out.println();

        barbearia.mostrarBarbeiros();
        System.out.println();

        barbearia.mostrarServicos();
    }
}
