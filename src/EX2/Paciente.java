package EX2;

public class Paciente {
    String nome;
    int idade;

    public int frequenciaMaxima(){
        return 220 - idade;
    }

    public double[] frequenciaAlvo(){
        double[] alvo = new double[2];
        int fm = frequenciaMaxima();
        alvo[0]= fm*0.5;
        alvo[1]=fm*0.85;
        return alvo;
    }
}


