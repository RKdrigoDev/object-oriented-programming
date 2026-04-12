package UsoMetodoConstrutor.Treino.EX03.BeanAndCodeCafe;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private ItemPedido[] itens;
    private int index;
    private String status;

    public Pedido(int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ItemPedido[20];
        this.index = 0;
        this.status = "ABERTO";
    }
    public void adicionarItem(ItemPedido item){
      for (int i =0;i< itens.length;i++){
          itens[i]=item;
      }
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
