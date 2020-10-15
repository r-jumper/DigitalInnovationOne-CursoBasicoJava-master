package aulas.oo.part03.encapsulamento.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Fernando", 26, 05, 1979);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Fernando Cesar");

        System.out.println(eu.getNome());

    }
}
