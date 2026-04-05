package LambdaStreamLog.Lambda.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Sayuri Moma", 3500.00));
        funcionarios.add(new Funcionario("Caio Lemes", 2000.00));
        funcionarios.add(new Funcionario("Matheus Veiga", 10000.00));

        //ordenando eles em ordem crescente de salario
        funcionarios.forEach(f -> System.out.println("\n" + f.getNome() + "\n" + f.getSalario()));

        funcionarios.sort((f1, f2) -> Double.compare(f1.getSalario(), f2.getSalario()));
        System.out.println("\n--- Funcionarios Ordenados por Salario ---");
        funcionarios.forEach(f -> System.out.println(f.getNome() + " - R$ " + f.getSalario()));
    }
}
