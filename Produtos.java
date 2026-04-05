package LambdaStreamLog.Stream.Aula;

public class Produtos {
    private String nome;
    private int estoque;
    private double preco;

    public Produtos(String nome, int estoque, double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }


}
