package sudoku;

/**
 * Implémentation de l'interface ElementDeGrille.
 * Elle utilise un caractère pour représenter la valeur d'un élément de grille.
 *
 * @author Gilles MAMBIDI
 *
 */
public class ElementDeGrilleImplAsChar implements ElementDeGrille {
    /**
     * Valeur de l'élément de grille.
     */
    private char value;

    /**
     * Crée une instance de ElementDeGrilleImplAsChar avec la valeur spécifiée.
     *
     * @param initialValue Valeur initiale de l'élément de grille.
     */
    public ElementDeGrilleImplAsChar(final char initialValue) {
        this.value = initialValue;
    }

    /**
     * Définit la valeur de l'élément de grille.
     *
     * @param newValue Nouvelle valeur de l'élément de grille.
     */
    @Override
    public void setValue(final char newValue) {
        this.value = newValue;
    }

    /**
     * Renvoie la valeur de l'élément de grille.
     *
     * @return Valeur de l'élément de grille.
     */
    @Override
    public char getValue() {
        return value;
    }
}
