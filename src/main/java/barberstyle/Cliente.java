
package barberstyle;

public class Cliente extends Pessoa {

    public Cliente(int id, String nome, String telefone) {
        super(id, nome, telefone);
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }
}
