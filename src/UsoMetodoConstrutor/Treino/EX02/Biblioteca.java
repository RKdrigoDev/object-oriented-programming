package UsoMetodoConstrutor.Treino.EX02;


import java.util.Scanner;

public class Biblioteca {

    Livro[] livro;

    public Biblioteca() {
        this.livro = new Livro[20];
    }
    public void adicionarLivro(String livroN){
        Livro livrosAchado=buscarLivro(livroN);
        if (livrosAchado!=null){
            System.out.println("esse livro já está no sistema");
            return;
            }
        for (int i =0; i<livro.length;i++){
            if (livro[i]==null){
                livro[i]=new Livro(livroN);
                return;
            }
        }

    }

    public Livro buscarLivro(String livroN) {
        for (int i=0; i< livro.length;i++){
            if (livro[i]!=null&&livro[i].titulo.equalsIgnoreCase(livroN)) {
                return livro[i];
            }

            }
        return null;
    }
}
