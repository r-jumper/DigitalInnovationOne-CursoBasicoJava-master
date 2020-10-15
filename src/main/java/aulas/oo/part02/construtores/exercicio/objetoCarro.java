package aulas.oo.part02.construtores.exercicio;

class ObjCarro {

    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "ka", "2009", "preta");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());

        carro.setCor("Preta");

        System.out.println(carro.getCor());
    }
}
