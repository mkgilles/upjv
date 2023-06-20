package upvj.sudoku;

public class ValeurImpossibleException extends Throwable {
    /**
     * Construit une nouvelle instance avec un message.
     *
     * @param message le message détaillé
     */
    public ValeurImpossibleException(final String message) {
        super(message);
    }
}
