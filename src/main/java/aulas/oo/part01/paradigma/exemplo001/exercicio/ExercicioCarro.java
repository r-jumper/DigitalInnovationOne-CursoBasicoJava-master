package aulas.oo.part01.paradigma.exemplo001.exercicio;

public class ExercicioCarro {

    private int qtdPessoa = 0;

    public int getQtdPessoa(){
        return qtdPessoa;
    }

    public void entraCarro(int qtdPessoaAdd){
        this.qtdPessoa += qtdPessoaAdd;
    }

    public void saiCarro(int qtdPessoaAdd){
        this.qtdPessoa -= qtdPessoaAdd;

    }

}
