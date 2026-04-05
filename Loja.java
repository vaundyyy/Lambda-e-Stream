package LambdaStreamLog.Stream.Aula;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    public static void main(String[] args) {
        List<Produtos> produtos = new ArrayList<>();
        produtos.add(new Produtos("Macbook Neo", 100, 4292.99));
        produtos.add(new Produtos("Galaxy zFold 6", 48, 5650.00));
        produtos.add(new Produtos("Logitech G pro superlight 2", 32, 750.99));
        System.out.println("--- Produtos com estoque baixo (com preço de queima de estoque) ---");

        //A linha de montagem da Stream
        //1 -> Coloca na esteira
        produtos.stream()
                // 2. Estação 1: Filtra quem tem menos de 50 no estoque
                .filter(p -> p.getEstoque() < 50)
                // 3. Estação Terminal: Imprime aplicando o desconto na hora
                .forEach(p -> {
                    double precoComDesconto = p.getPreco() * 0.90;
                    System.out.println(p.getNome() + " - Novo preço: R$ " + precoComDesconto);
                });
    }
}
