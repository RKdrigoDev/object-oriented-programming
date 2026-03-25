package UsoMetodoConstrutor.Geral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static Carros[] carro = new Carros[10];
    static Controle[] controles = new Controle[20];
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
                case 2 -> registrarSaida();
                case 3 ->carrosEstacionados();
                case 4 -> imprimirReceita();
                default -> System.out.println("opecação finalizada");


            }

        }while(opcao!=5);



    }
    public static void imprimirReceita(){
        double receita=0;
        for (int i =0; i<indexControle ; i++){
            if (controles[i]!=null){
                receita+=controles[i].calcularEstadia();
            }
        }
        System.out.println("o valor de receita foi de R$ "+receita);

    }

    public static void registrarSaida() {
        DecimalFormat df=new DecimalFormat("#,##0.00");
        String horaSaida;
        double valor;
        Controle controle=pesquisarControle();
        if(controle!=null){
            System.out.println("fala a hora que saiu --> ");
            horaSaida=sc.next();
            controle.horaSaida=horaSaida;
            valor= controle.calcularEstadia();
            System.out.println("valor total ficou R$ "+df.format(valor));
        }
    }

    public static Controle pesquisarControle() {
        String placa;
        System.out.println("digite a placa --> ");
        placa=sc.next().toUpperCase();
        for(int i=0; i<indexControle; i++){
            if (controles[i].carros.placa.equals(placa)){
                return controles[i];

            }
        }
        System.out.println("placa não encontrada");
        return null;
    }

    public static void carrosEstacionados() {
        for (int i = 0; i < indexControle; i++) {
            if (controles[i].horaSaida == null) {
                System.out.println(controles[i].carros.placa);
            }
        }
    }

    private static void registrarEntrada() {
       String placa, marca, modelo;
       String nome;
       long cpf;
       String horaEntrada;

        System.out.println("placa --> ");
        placa=sc.next().toUpperCase();
        Carros carros= pesquisar(placa);
       if (carros==null){
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
       controles[indexControle]= new Controle(carros,horaEntrada);

    }
    public static Carros pesquisar(String placa){
        System.out.println("digite a placa --> ");
        placa=sc.next().toUpperCase();
        for(int i=0; i<indexCarros; i++){
            if (carro[i].placa.equals(placa)){
                return carro[i];

            }
        }
        System.out.println("placa não encontrada");
        return null;
    }



}
