package first.exercise;

/**
 * Classe Produit représentant un produit avec un prix et une référence.
 */
public class Produit {

    /** La référence du produit. */
    private final String reference;

    /** Le prix du produit. */
    private double prix;

    /** La TVA appliquée sur le produit. */
    private static final double TVA = 0.20;

    /**
     * Constructeur de la classe Produit.
     *
     * @param ref la référence du produit
     * @param price      le prix du produit
     */
    public Produit(final String ref, final double price) {
        this.reference = ref;
        this.prix = price;
    }

    /**
     * @return le prix du produit
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Modifie le prix du produit.
     *
     * @param price le nouveau prix
     */
    public void setPrix(final double price) {
        this.prix = price;
    }

    /**
     * @return la référence du produit si le prix est positif, null sinon
     */
    public String getReference() {
        return prix > 0 ? reference : null;
    }
    /**
     * Calcul du prix du produit en TTC.
     * @return le prix en toutes taxes comprises
     * */
    public double getPrixTTC() {

        return this.prix + TVA;
    }

    /**
     * Compare si deux produits sont égaux en comparant leur référence.
     */
    @Override
    public boolean equals(final Object obj) {
        return obj instanceof Produit pro && reference.equals(pro.reference);

    }


    /**
     * Calcule le code de hachage de la référence du produit.
     */
    @Override
    public int hashCode() {
        return reference.hashCode();
    }

}
