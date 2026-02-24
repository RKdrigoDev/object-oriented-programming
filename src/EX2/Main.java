package EX2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        double[] alvo;
        System.out.println("diga a sua idade -->");
        paciente.idade=sc.nextInt();
        System.out.println("diga o seu nome -->");
        paciente.nome=sc.next();

        System.out.println("Frequencia Máxima: "+paciente.frequenciaMaxima());
        alvo= paciente.frequenciaAlvo();
        System.out.println("inicio da frequencia alvo "+alvo[0]);
        System.out.println("fim da frequencia alvo "+alvo[1]);
    }
}
