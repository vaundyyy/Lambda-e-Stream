package LambdaStreamLog.Lambda.Aula;

import java.util.ArrayList;
import java.util.List;

public class AppConta {
    public static void main(String[] args) {
        List<Transacao> transacoes = new ArrayList<>();

        transacoes.add(new Transacao(1500.0, "Depósito"));
        transacoes.add(new Transacao(-250.0, "Compra no mercado"));
        transacoes.add(new Transacao(-150.00, "Pagamento de luz"));

        // IMPLEMENTAÇÃO DO LAMBDA
        // Lógica: Remova se a transação for menor que zero.
        // 't' é o parâmetro (a transação atual na lista)
        // 't.getValor() < 0' é a regra.
        transacoes.removeIf(t -> t.getValor() < 0);

        System.out.println("Apenas transações positivas:");
        for (Transacao t : transacoes) {
            System.out.println(t);
        }
    }
}
