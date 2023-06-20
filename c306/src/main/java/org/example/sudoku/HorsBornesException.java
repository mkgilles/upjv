package sudoku;

/**
 * Exception levée lorsque les paramètres de positions sortent de la grille.
 */
public class HorsBornesException extends Exception {
    /**
     * Construit une nouvelle HorsBornesException avec un message.
     *
     * @param message le message détaillé
     */
    public HorsBornesException(final String message) {
        super(message);
    }
}
