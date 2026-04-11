package UsoMetodoConstrutor.Treino.EX01;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
      String cor;
      int marcha;
      double valor;
        System.out.println("qual a cor da bicilcleta que voce quer vender?");
        cor=sc.next();
        System.out.println("ela tem quantas marchas?");
        marcha=sc.nextInt();
        System.out.println("quer vender por quanto?");
        valor=sc.nextDouble();
        Bicicleta bicicleta=new Bicicleta(cor,marcha,valor);
        bicicleta.imprimir();
    }
}
