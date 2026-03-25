package UsoMetodoConstrutor.Geral;

public class Carros {
    String marca;
    String modelo;
    String placa;
    Proprietario proprietario;

    public Carros(String marca, String modelo, String placa, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.proprietario = proprietario;
    }
}
