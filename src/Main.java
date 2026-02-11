import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Aluno aluno=new Aluno();
    System.out.println("digite o seu nome -->");
    aluno.nome= sc.next();
    System.out.println("digite curso -->");
    aluno.curso=sc.next();
    System.out.println("digite o rm -->");
    aluno.rm=sc.nextInt();
    System.out.println(aluno.nome);
    System.out.println(aluno.curso);
    System.out.println(aluno.rm);
    System.out.println("nota 1 -->");
    aluno.nota1= sc.nextDouble();
    System.out.println("nota 2 -->");
    aluno.nota2= sc.nextDouble();
        System.out.println(aluno.calcularMedia());
        if(aluno.verificar()){
            System.out.println("passou");
        }
        else {
            System.out.println("não passou");
        }

}

}
