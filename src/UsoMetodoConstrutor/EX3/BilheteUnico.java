package UsoMetodoConstrutor.EX3;

import java.util.Random;

public class BilheteUnico {
    String usuario;
    int numeroBilhete;
    double saldo;
    String tipo;
    final static double tarifa = 5.40;
    public BilheteUnico(String usuario, String tipo){
        Random r=new Random();
        this.numeroBilhete= r.nextInt(1000, 9999);
        this.usuario=usuario;
        this.tipo=tipo;
    }
    public void calcularTarifa(){
        double valor=tarifa;
        if (tipo.equals("Estudante")||tipo.equals("Professor")){
           valor=tarifa/2;
        }
        if (saldo<=valor){
            System.out.println("saldo insuficiente");
            return;
        }
        saldo-=valor;
    }


}
