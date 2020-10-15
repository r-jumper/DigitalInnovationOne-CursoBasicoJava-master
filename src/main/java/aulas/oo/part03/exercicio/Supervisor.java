package aulas.oo.part03.exercicio;

public class Supervisor extends Funcionario{

    public double calculoImposto(){
        return getSalario() * 0.05;
    }
}
