

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


}
