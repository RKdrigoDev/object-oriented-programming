package EX3;

public class Main {
    public static void main(String[] args) {
        Professor professor=new Professor();
        professor.aulas=40;
        professor.valorAula=220;

        System.out.println(professor.salario());
    }
}
