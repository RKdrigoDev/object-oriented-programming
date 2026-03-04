package UsoMetodoConstrutor.EX1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;
        System.out.println("nome do produto -->");
        nome=sc.next();
        System.out.println("valor dele -->");
        valor=sc.nextDouble();
        System.out.println("quantidade -->");
        quantidade=sc.nextInt();
        Produto produto=new Produto(nome, valor, quantidade);
        System.out.println(produto.nome);
        System.out.println(produto.valor);
        System.out.println(produto.quantidade);
    }
}
