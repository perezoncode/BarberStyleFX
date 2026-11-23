
package barberstyle;

public class Barbeiro extends Pessoa {

    private double valorDiaria;

    public Barbeiro(int id, String nome, String telefone,
                    double valorDiaria) {

        super(id, nome, telefone);
        this.valorDiaria = valorDiaria;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public String getTipo() {
        return "Barbeiro";
    }
}
