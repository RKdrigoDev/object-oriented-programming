package UsoMetodoConstrutor.Treino.EX03.BeanAndCodeCafe;

class Cliente {
    private String nome;
    private long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }
    public void getDados(){
        System.out.println("Cliente: "+nome+" | CPF: "+cpf);
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
