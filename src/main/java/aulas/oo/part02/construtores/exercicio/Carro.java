package aulas.oo.part02.construtores.exercicio;

public class Carro {

    private String marca;
    private String modelo;
    private String ano;
    private String cor;

    public Carro(String marca,
                 String modelo,
                 String ano,
                 String cor){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getMarca(){
        return marca;
    
    }
    public String getModelo(){
        return modelo;

    }

    public String getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}
