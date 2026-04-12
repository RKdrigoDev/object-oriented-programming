package UsoMetodoConstrutor.Treino.EX02;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Biblioteca biblioteca= new Biblioteca();

    public static void main(String[] args) {
        int opcao;
        Livro livroN;
        do {
            System.out.println("Digite o nome do livro");
            livroN.titulo=sc.next();
        System.out.println("""
                #### Biblioteca do Bilbo ####
                    [1] Adicionar Livro
                    [3] Devolver Livro
                    [4] Emprestar Livro
                    [5] FInalizar""");
        opcao=sc.nextInt();
            switch (opcao){
                case 1 -> biblioteca.adicionarLivro(livroN);
                case 2 -> biblioteca.buscarLivro(livroN);
                case 3 -> devolverLivro(livroN);
                case 4 -> emprestarLivro(livroN);
                default -> System.out.println("processo finalizado");
            }
        }
        while (opcao!=5);



    }

    private static void emprestarLivro(Livro livroN) {
        Livro livros =biblioteca.buscarLivro(livroN);
        if (livros!=null){
            System.out.println("o livro está disponivel");

        }
        else {
            System.out.println("o livro não está disponivel");
        }

    }

    public static void devolverLivro(Livro livroN){

        Livro livros=biblioteca.buscarLivro(livroN);
        if (livros!=null){
            System.out.println("o livro já foi devolvido");
        }
        biblioteca.adicionarLivro(livroN);
    }


}
