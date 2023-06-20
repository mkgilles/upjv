package upvj.sudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * Implémentation de l'interface Grille pour représenter une grille de Sudoku.
 */
public class GrilleImpl implements Grille {
    /**
     * Dimension de la grille.
     */
    private final int dimension;
    /**
     * Tableau à deux dimensions pour stocker les éléments de la grille.
     */
    private final ElementDeGrille[][] grille;

    /**
     * Crée une instance de GrilleImpl avec la dimension spécifiée.
     *
     * @param elements Tableau d'éléments possibles dans la grille.
     */
    public GrilleImpl(ElementDeGrille[] elements) {
        this.dimension = elements.length;
        this.grille = new ElementDeGrille[dimension][dimension];
    }

    /**
     * Renvoie l'ensemble des éléments possibles dans la grille.
     *
     * @return Ensemble des éléments possibles dans la grille.
     */
    @Override
    public Set<ElementDeGrille> getElements() {
        Set<ElementDeGrille> elements = new HashSet<>();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                ElementDeGrille element = grille[i][j];
                if (element != null) {
                    elements.add(element);
                }
            }
        }
        return elements;
    }

    /**
     * Renvoie la dimension de la grille.
     *
     * @return Dimension de la grille.
     */
    @Override
    public int getDimension() {
        return dimension;
    }

    /**
     * Définit la valeur d'une case de la grille.
     *
     * @param x     Coordonnée x de la case à modifier.
     * @param y     Coordonnée y de la case à modifier.
     * @param value Nouvelle valeur à affecter à la case.
     * @throws HorsBornesException
     * Si les coordonnées x et y sont en dehors des bornes de la grille.
     * @throws ValeurImpossibleException
     * Si la valeur spécifiée n'est pas possible pour cette case.
     * @throws ElementInterditException
     * Si l'élément spécifié n'est pas autorisé dans cette grille.
     * @throws ValeurInitialeModificationException
     * Si la case spécifiée contient une valeur initiale non modifiable.
     * @throws CaractereInterditException
     * Si le caractère spécifié n'est pas autorisé dans cette grille.
     */
    @Override
    public void setValue(final int x, final int y, final ElementDeGrille value)
            throws HorsBornesException, ValeurImpossibleException,
            ElementInterditException, ValeurInitialeModificationException,
            CaractereInterditException {
        if (x < 0 || x >= dimension || y < 0 || y >= dimension) {
            throw new HorsBornesException("Coordinates are out of bounds");
        }

        if (!isPossible(x, y, value)) {
            throw new ValeurImpossibleException("Valeur impossible");
        }

        if (value != null && !getElements().contains(value)) {
            throw new ElementInterditException();
        }

        if (isValeurInitiale(x, y)) {
            throw new ValeurInitialeModificationException("");
        }

        grille[x][y] = value;
    }

    /**
     * Renvoie la valeur d'une case de la grille.
     *
     * @param x Coordonnée x de la case à lire.
     * @param y Coordonnée y de la case à lire.
     * @return Valeur de la case spécifiée.
     * @throws HorsBornesException
     * Si les coordonnées x et y sont en dehors des bornes de la grille.
     */
    @Override
    public ElementDeGrille getValue(final int x, final int y)
            throws HorsBornesException {
        if (x < 0 || x >= dimension || y < 0 || y >= dimension) {
            throw new HorsBornesException("");
        }

        return grille[x][y];
    }

    /**
     * Indique si la grille est complète.
     *
     * @return true si la grille est complète, false sinon.
     */
    @Override
    public boolean isComplete() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (grille[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Indique si une valeur est possible pour une case de la grille.
     *
     * @param x     Coordonnée x de la case à vérifier.
     * @param y     Coordonnée y de la case à vérifier.
     * @param value Valeur à vérifier.
     * @return true si la valeur est possible pour cette case, false sinon.
     * @throws HorsBornesException
     * Si les coordonnées x et y sont en dehors des bornes de la grille.
     * @throws ElementInterditException
     * Si l'élément spécifié n'est pas autorisé dans cette grille.
     */
    @Override
    public boolean isPossible(final int x, final int y,
                              final ElementDeGrille value)
            throws HorsBornesException, ElementInterditException {
        if (x < 0 || x >= dimension || y < 0 || y >= dimension) {
            throw new HorsBornesException("");
        }

        if (value != null && !getElements().contains(value)) {
            throw new ElementInterditException();
        }

        // Vérifier les contraintes du Sudoku (non implémenté ici)

        return true;
    }

    /**
     * Indique si une case contient une valeur initiale.
     * Cette valeur ne peut pas être modifiée.
     *
     * @param x Coordonnée x de la case à vérifier.
     * @param y Coordonnée y de la case à vérifier.
     * @return true si la case contient une valeur initiale, false sinon.
     */
    @Override
    public boolean isValeurInitiale(final int x, final int y) {
        // Vérifier si la valeur de la case x, y est initiale
        // (non implémenté ici)
        return false;
    }
}
