package UsoMetodoConstrutor.Treino.EX01;

public class Bicicleta {
    String cor;
    int marcha;
    double valor;

    public Bicicleta(String cor, int marcha, double valor) {
        this.cor = cor;
        this.marcha = marcha;
        this.valor =valor;
    }
    public void imprimir(){
        System.out.println(cor);
        System.out.println(marcha);
        System.out.println(valor);
    }
}
