package EX1;

import java.util.Scanner;

public class Conta {
    String correntista;
    int numero;
    double saldo;
    public void Depositar(double valor){
        saldo+=valor;
    }
    public void Sacar(double valor){
        saldo-=valor;
    }
}
