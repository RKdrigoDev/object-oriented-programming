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
                case 2->
                case 3->
                case 4->
                case 5->

            }
        }while (opcao!=5);
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
                System.out.println("tipo de tarifa -->");
                tipoTarifa=sc.next();
                bilhete[index]= new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            }
    }
}



