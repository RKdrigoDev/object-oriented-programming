package UsoMetodoConstrutor.Treino.EX02;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Biblioteca biblioteca= new Biblioteca();
    static Livro[] livro;

    public static void main(String[] args) {
        int opcao;
        String livroN;
        System.out.println("Digite o nome do livro");
        livroN=sc.next();
        do {
        System.out.println("""
                #### Biblioteca do Bilbo ####
                    [1] Procurar Livro
                    [2] Devolver Livro
                    [3] Emprestar Livro
                    [4] FInalizar""");
        opcao=sc.nextInt();
            switch (opcao){
                case 1 -> biblioteca.buscarLivro(livroN);
                case 2 -> devolverLivro(livroN);
                case 3 -> emprestarLivro(livroN);
                default -> System.out.println("processo finalizado");
            }
        }
        while (opcao!=4);



    }

    private static void emprestarLivro(String livroN) {
        Livro livros =biblioteca.buscarLivro(livroN);
        if (livros!=null){
            System.out.println("o livro está disponivel");

        }
        System.out.println("o livro não está disponivel");


    }

    public static void devolverLivro(String livroN){

        Livro livros=biblioteca.buscarLivro(livroN);
        if (livros!=null){
            System.out.println("o livro já foi devolvido");
        }
        biblioteca.adicionarLivro(livroN);
    }


}
