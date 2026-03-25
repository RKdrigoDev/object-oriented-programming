package UsoMetodoConstrutor.Geral;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static Carros[] carro = new Carros[10];
    static Controle[] controle = new Controle[20];
    static int indexCarros;
    static int indexControle;
    public static void main(String[] args) {
        int opcao;
        do{
            System.out.println("""
                    #### Estacionamento ParkEasy ####
                            [1] Entrada de veículo
                    [2] Saída de veículo
                    [3] Imprimir veículos estacionados
                    [4] Imprimir a receita
                    [5] Finalizar
                    """);
            opcao=sc.nextInt();

            switch (opcao){
                case 1 -> registrarEntrada();
                case 2 -> carrosEstacionados();


            }

        }while(opcao!=5);



    }
    public static void carrosEstacionados(){
        for (int i=0; i<indexControle; i++){
            System.out.println(controle[i].carros.placa);
        }
    }

    private static void registrarEntrada() {
       String placa, marca, modelo;
       String nome;
       long cpf;
       String horaEntrada;
       Carros carros= pesquisar();
       if (carros==null){
           System.out.println("placa --> ");
           placa=sc.next().toUpperCase();
           System.out.println("modelo --> ");
           modelo=sc.next();
           System.out.println("marca --> ");
           marca=sc.next();
           System.out.println("nome do proprietário --> ");
           nome=sc.next();
           System.out.println("CPF --> ");
           cpf=sc.nextLong();
           Proprietario proprietario = new Proprietario(nome,cpf);
           carro[indexCarros] = new Carros(marca,modelo,placa,proprietario);
           indexCarros++;
       }
        System.out.println("hora de entrada (hh:mm) --> ");
       horaEntrada=sc.next();
       controle[indexControle]= new Controle(carros,horaEntrada);

    }
    public static Carros pesquisar(){
        String placa;
        System.out.println("digite a placa --> ");
        placa=sc.next().toUpperCase();
        for(int i=0; i<indexCarros; i++){
            if (carro[i].placa.equals(placa)){

            }
        }
        System.out.println("placa não encontrada");
        return null;
    }


}

