package UsoMetodoConstrutor.EX3;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.println("nome do usuario -->");
        String usuario=sc.nextLine();
        System.out.println("tipo de bilhete -->");
        String tipo=sc.next();
        bilhete= new BilheteUnico(usuario, tipo);
    }

    public static void main(String[] args) {
        int opcao;
        do{
            System.out.println("************************************************");
            System.out.println("1. carregar bilhete");
            System.out.println("2. consultar saldo");
            System.out.println("3. passar catraca");
            System.out.println("4. finalizar");
            opcao=sc.nextInt();

            switch (opcao){
                case 1 -> carregar();
                case 2 -> consultar();
                case 3 -> catraca();
                case 4 -> System.out.println("obrigado por usar o nosso app!");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao!=4);
    }

    private static void catraca() {
        if(!bilhete.calcularTarifa()) {
            System.out.println("saldo insuficiente");

        }
        consultar();
    }

    private static void consultar() {
        System.out.println("saldo atual --> "+bilhete.saldo);

    }

    private static void carregar() {
        double valor;
        System.out.println("Valor da recarga -->");
        valor=sc.nextDouble();
        bilhete.carregar(valor);
    }
}
