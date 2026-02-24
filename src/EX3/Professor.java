package EX3;

public class Professor {
    String nome;
    int aulas;
    double valorAula;
    public double salario(){
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;
        salarioBase= aulas*valorAula*4.5;
        horaAtividade= (double) 5 / 100 * salarioBase;
        descansoSemanal= (salarioBase+horaAtividade)/6;
        return salarioBase+horaAtividade+descansoSemanal;
    }

}
