package UsoMetodoConstrutor.EX5;

import java.util.Scanner;

//1- cadastrar bilhete
//2- carregar bilhete
//3- consultar saldo
//4- passar na catraca
//5- finalizar
public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[3];
    static Scanner sc=new Scanner(System.in);
    static int index=0;
    public static void main(String[] args) {
        int opcao;

        do{
            System.out.println("[1] cadastrar bilhete");
            System.out.println("[2] carregar bilhete");
            System.out.println("[3] consultar bilhete");
            System.out.println("[4] passar na catraca");
            System.out.println("[5] finalizar");
            opcao= sc.nextInt();
            switch (opcao){
                case 1-> cadastrar();
                case 2-> carregar();
                case 3-> consultarSaldo();
                case 4-> passarCatraca();
                case 5-> System.out.println("até breve");
                default -> System.out.println("opção inválida");

            }
            System.out.println("############################################");
        }while (opcao!=5);
    }

    private static void passarCatraca() {
        BilheteUnico bu=pesquisar();
        if (bu!=null){
            if (!bu.passarNaCatraca()){
                System.out.println("saldo insuficiente, não passou");
            }

            System.out.println("saldo atual: "+ bu.saldo);
        }
    }

    private static void consultarSaldo() {
        BilheteUnico bu=pesquisar();
        if (bu!=null){
            System.out.println("saldo atual --> "+ bu.saldo);
        }
    }

    public static void cadastrar(){
            String nome;
            long cpf;
            String tipoTarifa;

            if (index< bilhete.length){
                System.out.println("nome --> ");
                nome=sc.next();
                System.out.println("cpf --> ");
                cpf=sc.nextLong();
                System.out.println("tipo de tarifa | comum | aluno | professor | -->");
                tipoTarifa=sc.next();
                bilhete[index]= new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
                index++;
            }
    }
    public static BilheteUnico pesquisar(){
        long cpf;
        System.out.println("cpf para pesquisar: ");
        cpf=sc.nextLong();
        for(int i=0; i<index; i++){
            if(bilhete[i].usuario.cpf==cpf){
                return bilhete[i];
            }
        }
        System.out.println("bilhete não encontrado");

        return null;
    }
    public static void carregar(){
        double valor;
        BilheteUnico bu=pesquisar();
        if (bu!=null){
            System.out.println("valor a carregar --> ");
            valor=sc.nextDouble();
            bu.carregar(valor);
        }
    }

}



