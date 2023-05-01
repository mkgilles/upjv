/**
 * 
 */
package second.exo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author gilles.mambidi
 *
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



/***
 * Classe de test.
 */

class TabAlgosTest {

    /**
     * Constants 3.
     */
    private static final int THREE = 3;
    /**
     * Constante 4 .
     */
    private static final int FOUR = 4;
    /**
     * Constante 5.
     **/
    private static final int FIVE = 5;

    /**
     * THREE_POINT_ZERO est une constante 3.0.
     */
    private static final double THREE_POINT_ZERO = 3.0;
    /**
     * ZERO_POINT_ZERO_ZERO_ONE est la precision suite à la division.
     */
    private static final double DELTA = 0.001;


    @Test
    void testPlusGrand() {
        final int[] tab = {1, 2, THREE, FOUR, FIVE};
        Assertions.assertEquals(FIVE, TabAlgos.plusGrand(tab),
                "La plus grande valeur est 5.");
    }

    @Test
    void testMoyenne() {
        final int[] tab = {1, 2, THREE, FOUR, FIVE};
        Assertions.assertEquals(THREE_POINT_ZERO, TabAlgos.moyenne(tab),
                DELTA, "La moyenne est 3.0.");
    }

    @Test
    void testMoyenneTableauVide() {
        final int[] tab = {};
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> TabAlgos.moyenne(tab));
    }

    @Test
    void testEgaux() {
        final int[] tab1 = {1, 2, THREE};
        final int[] tab2 = {1, 2, THREE};
        Assertions.assertTrue(TabAlgos.egaux(tab1, tab2),
                "Les deux tableaux sont égaux");
    }

    @Test
    void testEgauxDifferentOrder() {
        final int[] tab1 = {1, 2, THREE};
        final int[] tab2 = {THREE, 2, 1};
        Assertions.assertFalse(TabAlgos.egaux(tab1, tab2),
                "les 2 tableaux ont les meme elements "
                        + "et ordonnés de maniere differentes");
    }

    @Test
    void testSimilaires() {
        final int[] tab1 = {1, 2, THREE};
        final int[] tab2 = {THREE, 2, 1};
        Assertions.assertTrue(TabAlgos.similaires(tab1, tab2),
                "Les 2 tableaux contiennent les mêmes éléments");
    }

    @Test
    void testSimilairesDifferentCounts() {
        final int[] tab1 = {1, 2, THREE};
        final int[] tab2 = {1, 2, 2};
        Assertions.assertFalse(TabAlgos.similaires(tab1, tab2),
                "Au moins une une paire d'elements "
                        + "contenue Les 2 tableaux ne sont pas égaux");
    }
}
