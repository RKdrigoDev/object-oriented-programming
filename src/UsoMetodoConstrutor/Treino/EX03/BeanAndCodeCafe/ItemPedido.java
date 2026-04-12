package UsoMetodoConstrutor.Treino.EX03.BeanAndCodeCafe;

public class ItemPedido {
    private String nomeProduto;
    private double precoUnico;
    private int quantidade;

    public ItemPedido(String nomeProduto, double precoUnico, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoUnico = precoUnico;
        this.quantidade = quantidade;
    }
    public double calcularSubtotal(){
        double valorTotal=0;
        valorTotal=precoUnico*quantidade;
        return valorTotal;
    }
    public void getDados(){
        System.out.println(nomeProduto+" | Quantidade: "+quantidade+" | Unitário: R$ "+precoUnico+" | Subtotal: R$ "+calcularSubtotal());
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnico() {
        return precoUnico;
    }

    public void setPrecoUnico(double precoUnico) {
        this.precoUnico = precoUnico;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
