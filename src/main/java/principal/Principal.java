package principal;

import model.Ave;
import model.Cachorro;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob");
        Ave ave = new Ave("Blue");

        System.out.println("Cachorro: " + cachorro.getNome());
        cachorro.produzirSom();
        cachorro.mover();

        System.out.println("\nAve: " + ave.getNome());
        ave.produzirSom();
        ave.mover();
    }
}