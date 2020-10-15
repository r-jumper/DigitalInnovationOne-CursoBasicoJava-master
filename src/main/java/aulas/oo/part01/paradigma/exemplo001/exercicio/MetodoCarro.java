package aulas.oo.part01.paradigma.exemplo001.exercicio;

public class MetodoCarro {

    public static void main(String[] args) {
        ExercicioCarro carro = new ExercicioCarro();

        int qtd;

        qtd  = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.entraCarro(1);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.entraCarro(3);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);

        carro.saiCarro(2);
        qtd = carro.getQtdPessoa();
        System.out.println(qtd);
    }
}
