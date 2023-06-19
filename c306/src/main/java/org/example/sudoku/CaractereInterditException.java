package upvj.sudoku;
/**
 *
 * @author Gilles MAMBIDI
 */
public class CaractereInterditException extends Throwable {

    /***/
    private final String info = "Cette valeur  ne fait pas "
            + "partie du jeu de valeurs utilisé par la grille";
    /**
     * @Constructeur
     * @param s : message d'erreur envoyé
     * */
    public CaractereInterditException(final String s) {
    }
}
