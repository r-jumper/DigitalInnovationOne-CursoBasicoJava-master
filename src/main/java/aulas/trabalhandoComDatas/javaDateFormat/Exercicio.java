package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {

  public static void main(String[] args) {

            Date atual = new Date();

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:MM:SS:mmm");

            String dataHoraFormatada = formatter.format(atual);

            System.out.println(dataHoraFormatada);


        }
  }
