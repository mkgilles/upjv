package first.exercice;

import  first.exercise.Produit;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Produit p = new Produit("GLK", 12.89);
        System.out.println(p.getPrix());
        System.out.println(p.getReference());
        Produit g = new Produit("TGO", 0.9);
        System.out.println(p.equals(g));

    }
}