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

            }
        }
        while (opcao!=6);
    }

    private static void adicionarItem() {
        int numeroDePedido;

        System.out.println("digite o seu numero de pedido");
        numeroDePedido=sc.nextInt();
        verificarExiste(numeroDePedido);
        if (verificarExiste(numeroDePedido)) {


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
    if (!verificarExiste(numeroDePedido)){
        for(int i =0; i<pedidos.length;i++){
            if(pedidos[i]==null){
                pedidos[i]= new Pedido(numeroDePedido,cliente);
                index++;
                return;
            }
        }

    }

}

private static boolean verificarExiste(int numeroDePedido) {
    for (int i =0; i<pedidos.length;i++){
        if (pedidos[i]!=null&&numeroDePedido==pedidos[i].getNumeroPedido()){
            System.out.println("O pedido existe");
            return true;
        }
    }
    return false;
}

public void main() {
}