package aulas.oo.part03.exercicio;

public class Atendente extends Funcionario{

    public double calculoImposto(){
        return getSalario() * 0.01;
    }
}
