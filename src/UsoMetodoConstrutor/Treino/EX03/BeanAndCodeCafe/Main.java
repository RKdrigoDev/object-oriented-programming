package UsoMetodoConstrutor.Treino.EX03.BeanAndCodeCafe;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static Pedido[] pedidos=new Pedido[100];
    static int index=0;

    public static void main(String[] args){
        int opcao;
        String nome;
        long cpf;
        do {
            System.out.println("""
                    Bem-Vindo ao Bean & Code Café
                    Antes de realizar o pedido, você deveria me dizer o seu nome o CPF""");
            nome=sc.next();
            cpf=sc.nextLong();
            Cliente cliente= new Cliente(nome,cpf);
            System.out.println(""" 
                    #### Bean & Code Café ####
                    [1] Registrar novo pedido
                    [2] Adicionar item a um pedido
                    [3] Finalizar pedido
                    [4] Listar pedidos em aberto
                    [5] Exibir faturamento do dia
                    [6] Sair""");
            opcao=sc.nextInt();
            switch (opcao){
                case 1 -> registrarNovoPedido(cliente);
                case 2 -> adicionarItem();
                case 3 -> finalizarPedido();
                case 4 -> listarPedidosAbertoss();
                case 5 -> exibirFaturamento();
                default -> System.out.println("processo finalizado");

            }
        }
        while (opcao!=6);
    }

    private static void exibirFaturamento() {
        double somaTotal=0;
        boolean pedidosFinalizados=false;
        for (int i =0;i<index;i++){
            if (pedidos[i].getStatus().equalsIgnoreCase("FINALIZADO")){
                pedidosFinalizados=true;
                somaTotal+=pedidos[i].calcularTotal();
                System.out.println(somaTotal);

            }
        }
        if (pedidosFinalizados){
            System.out.println("não há pedidos finalizados ainda");
            System.out.println(somaTotal);

        }

    }

    private static void listarPedidosAbertoss() {
        boolean tudoFinalizado=true;
        for (int i =0;i<index;i++){
            if (pedidos[i].getStatus().equalsIgnoreCase("ABERTO")){
                pedidos[i].getDados();
                tudoFinalizado=false;
            }
        }
        if (tudoFinalizado){
            System.out.println("não há pedidos abertos");
        }
    }

    private static void finalizarPedido() {
        int numeroDePedido;
        System.out.println("digite o numero do pedido");
        numeroDePedido=sc.nextInt();
        Pedido pedidoEncontrado=verificarExiste(numeroDePedido);
        if (pedidoEncontrado==null){
            System.out.println("não existe opedido");

        }
        else {
            if (pedidoEncontrado.getStatus().equalsIgnoreCase("ABERTO")){
                pedidoEncontrado.calcularTotal();
                pedidoEncontrado.setStatus("FINALIZADO");
                pedidoEncontrado.getDados();

            }
        }
    }

    private static void adicionarItem() {
        int numeroDePedido;
        int quantidade;
        double preco;
        String nome;

        System.out.println("digite o seu numero de pedido");
        numeroDePedido = sc.nextInt();
        Pedido pedidoEncontrado=verificarExiste(numeroDePedido);
        if (pedidoEncontrado!=null) {
            if (pedidoEncontrado.getStatus().equalsIgnoreCase("ABERTO")) {
                System.out.println("digite o nome do produto");
                nome = sc.next();
                System.out.println("digite a quantidade que vai comprar");
                quantidade = sc.nextInt();
                System.out.println("digite o preço do produto");
                preco = sc.nextDouble();
                ItemPedido itemPedido = new ItemPedido(nome, preco, quantidade);
                pedidoEncontrado.adicionarItem(itemPedido);
                System.out.println("item adicionado!");
            }
            else {
                System.out.println("pedido já finalizado!");
            }


        }
        else {
            System.out.println("não existe esse número de pedido ou número errado");
        }
    }


private static void registrarNovoPedido(Cliente cliente) {
    int numeroDePedido;
    System.out.println("Digite o númro do seu pedido -->");
    numeroDePedido=sc.nextInt();
    verificarExiste(numeroDePedido);
    if (verificarExiste(numeroDePedido)==null){
        for(int i =0; i<pedidos.length;i++){
            if(pedidos[i]==null){
                pedidos[i]= new Pedido(numeroDePedido,cliente);
                index++;
                return;
            }
        }

    }

}

private static Pedido verificarExiste(int numeroDePedido) {
    for (int i =0; i<pedidos.length;i++){
        if (pedidos[i]!=null&&numeroDePedido==pedidos[i].getNumeroPedido()){
            System.out.println("O pedido existe");
            return pedidos[i];
        }
    }
    return null;
}

public void main() {
}
}