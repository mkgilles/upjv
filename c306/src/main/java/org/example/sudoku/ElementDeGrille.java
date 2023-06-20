package sudoku;

/**
 * @author Sébastien Choplin <sebastien.choplin@u-picardie.fr>
 */
public interface ElementDeGrille {

    /**
     * Renvoi la valeur du charactere.
     * @return un charactere
     */
    char getValue();

    /**
     * Attribue une valeur à un charactere.
     *
     * @param value : valeur attribuée
     */
    void setValue(char value);
}
