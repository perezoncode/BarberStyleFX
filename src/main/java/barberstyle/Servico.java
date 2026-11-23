
package barberstyle;

public class Servico {

    private int id;
    private String descricao;
    private double preco;
    private int duracaoMinutos;

    public Servico(int id, String descricao, double preco,
                   int duracaoMinutos) {

        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}
