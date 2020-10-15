package aulas.oo.part03.exercicio;

public class Exercicio {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.getSalario();

        Supervisor supervisor = new Supervisor();
        supervisor.getSalario();

        Atendente atendente = new Atendente();
        supervisor.getSalario();

        System.out.println(gerente.calculoImposto());
        System.out.println(supervisor.calculoImposto());
        System.out.println(atendente.calculoImposto());
    }

}
