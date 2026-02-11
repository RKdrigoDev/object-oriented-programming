

public class Aluno {
    // atributos ou propriedades ou variaveis de instância(= objeto)
    String nome;
    String curso;
    int rm;
    double nota1;
    double nota2;

    public double calcularMedia(){

        double media;
        media=(nota1+nota2)/2;
        return media;
    }
    public boolean verificar(){
        boolean passou;
        if (calcularMedia()>=6) passou=true;

        else passou=false;

        return passou;
    }
    public void imprimir(){
        System.out.println("rm: "+ rm);
        System.out.println("nome: "+ nome);
        System.out.println("curso: "+ curso);
        System.out.println("nota 1: "+ nota1);
        System.out.println("nota 2: "+ nota2);

    }


}
