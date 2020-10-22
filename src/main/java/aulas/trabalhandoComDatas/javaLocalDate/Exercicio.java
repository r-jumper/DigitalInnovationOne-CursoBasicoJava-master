package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class Exercicio {

    public static void main(String[] args) {

        LocalDateTime atual = LocalDateTime.now();

        System.out.println("Data Hora atual: " + atual);


        LocalDateTime futuro = atual.plusHours(13).plusYears(4).plusMonths(6);

        System.out.println("Data Hora para 4 anos, 6 meses e 13 horas da data atual: " + futuro);

    }

}
