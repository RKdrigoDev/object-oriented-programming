package UsoMetodoConstrutor.EX6.main;

import UsoMetodoConstrutor.EX6.Departamento.Departamento;
import UsoMetodoConstrutor.EX6.Funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Departamento departamento=new Departamento("TI01","Rodrigo");
        departamento.adicionarFuncionario(new Funcionario("01","xx","diretor",85000));
        departamento.adicionarFuncionario(new Funcionario("02","yy","gerente",30000));
        departamento.adicionarFuncionario(new Funcionario("03","zz","estagiário",1200));
        //exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());

        //desligar um funcionário
        departamento.removerFuncionario("02");

        //exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());
    }
}
