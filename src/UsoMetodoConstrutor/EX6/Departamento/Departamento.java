package UsoMetodoConstrutor.EX6.Departamento;

import UsoMetodoConstrutor.EX6.Funcionario.Funcionario;

import java.text.DecimalFormat;

public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario[] funcionarios;
    private int index;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.index=0;/* não há necessidade */
        this.funcionarios= new Funcionario[5];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarFuncionario(Funcionario f){
        if(index< funcionarios.length && f.isAtivo()){
            funcionarios[index++]=f;
        }
    }
    public double calcularFolhaTotalLiquida(){
        double total=0;
        for(int i=0;i<index;i++){
            if (funcionarios[i].isAtivo()){
                total+=funcionarios[i].calcularSalarioLiquido();
            }
        }
        return total;
    }
    public int getTotalDeFuncionariosAtivos(){
        int total=0;
        for (int i =0; i<index; i++){
            if (funcionarios[i].isAtivo()){
                total++;
            }
        }
        return total;
    }
    public String exibirRelatorio(){
        DecimalFormat df=new DecimalFormat("#,##0.00");
        String aux= "";
        aux+="Departamento: "+nome + "\n";
        aux+= "total de funcionarios ativos: "+getTotalDeFuncionariosAtivos()+"\n";
        aux+= "folha de pagamento: "+ df.format(calcularFolhaTotalLiquida())+"\n";
        return aux;
    }
    public Funcionario buscarFuncionario(String matricula){
        for (int i=0;i<index;i++){
            if(funcionarios[i].getMatricula().equalsIgnoreCase(matricula)){
               return funcionarios[i];
            }
        }
        return null;
    }
    public void removerFuncionario(String matricula){
        Funcionario aux= buscarFuncionario(matricula);
        if(aux!=null){
            aux.desligar();
        }


    }
}
