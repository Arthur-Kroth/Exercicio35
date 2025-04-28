package model;

import interfaces.Animal;

public class Ave implements Animal {
    private String nome;

    public Ave(String nome) {
        this.nome = nome;
    }

    @Override
    public void produzirSom() {
        System.out.println("Cantar");
    }

    @Override
    public void mover() {
        System.out.println("Voar");
    }

    public String getNome() {
        return nome;
    }
}