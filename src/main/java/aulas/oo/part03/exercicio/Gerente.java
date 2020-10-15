package aulas.oo.part03.exercicio;

public class Gerente extends Funcionario {

    public double calculoImposto(){
        return getSalario() * 0.1;
    }
}
