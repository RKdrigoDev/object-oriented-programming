package UsoMetodoConstrutor.EX2;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1=new SenhaAtendimento("Semini");
        SenhaAtendimento s2=new SenhaAtendimento("Ana Maria Braga");
        SenhaAtendimento s3=new SenhaAtendimento("Roberto Carlos");
        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Proxima senha --> "+SenhaAtendimento.controle);
    }
}
