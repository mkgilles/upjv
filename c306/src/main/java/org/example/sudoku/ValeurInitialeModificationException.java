package sudoku;

public class ValeurInitialeModificationException extends Throwable {
    /**
     * Construit une nouvelle instance avec un message.
     *
     * @param message le message détaillé
     */
    public ValeurInitialeModificationException(final String message) {
        super(message);
    }
}
