package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exercicio002 {
    public static void main(String[] args) {

        Date dataNascimento = new Date(296594179044L);
        System.out.println(dataNascimento);

        Date dataComparacao = new Date(1273951869075L);
        System.out.println(dataComparacao);


        /** Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNascimento.after(dataComparacao);

        System.out.println(isAfter);


        /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNascimento.before(dataComparacao);

        System.out.println(isBefore);


    }
}
