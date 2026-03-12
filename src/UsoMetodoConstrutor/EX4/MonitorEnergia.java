package UsoMetodoConstrutor.EX4;

public class MonitorEnergia {
    double[] consumo;
    int contador;

    public MonitorEnergia(int tamanho) {
        this.consumo = new double[tamanho];
    }
    public void registrar(double valor){
        if (contador<consumo.length) {
            consumo[contador] = valor;
            contador++;
        }
    }
    public double calcularMedia(){
        double media=0;
        for (double valor: consumo){
            media+=valor;
        }
        return media/contador;
    }
    public double calcularMedia(int inicio, int fim){
        double media=0;
        for (int i=inicio; i<fim+1;i++){
            media+=consumo[i];

        }
        return media/(fim-inicio);
    }
}
