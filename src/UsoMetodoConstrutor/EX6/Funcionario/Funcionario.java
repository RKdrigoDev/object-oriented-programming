package UsoMetodoConstrutor.EX6.Funcionario;

public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualBonus;
    private boolean ativo;

    public Funcionario(String matricula, String nome, String cargo, double salabioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salabioBase;
        this.ativo=true;
    }

    public void definirBonus(double percentual) {
        if(percentual > 0) {
            percentualBonus = percentual;
        }
    }

    public void desligar() {
        ativo = false;
        percentualBonus = 0;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void aplicarAumento(double percentual) {
        salarioBase *= (1 + percentual / 100);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido(){
        double salarioLiquido=salarioBase+salarioBase*percentualBonus/100;
        return salarioLiquido*0.85;
    }
}
