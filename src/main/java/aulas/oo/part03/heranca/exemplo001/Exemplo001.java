package aulas.oo.part03.heranca.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setQuantidadeDePortas(4);

        Motocicleta moto = new Motocicleta();
        moto.setMarca("Suzuki");
        moto.setModelo("Boulevard");
        moto.setCilindradas("800");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getQuantidadeDePortas());

        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
        System.out.println(moto.getCilindradas());

    }

}
