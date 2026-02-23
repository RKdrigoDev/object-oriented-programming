package EX1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta=new Conta();
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("nome do correntista -->");
        conta.correntista=sc.next();
        System.out.println("numero da conta -->");
        conta.numero= r.nextInt(1000,9999);
        System.out.println(conta.numero);
        System.out.println(conta.saldo);
        conta.Depositar(8500);
        System.out.println(conta.saldo);
        conta.Sacar(6000);
        System.out.println(conta.saldo);
    }
}
