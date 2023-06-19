package second.exo;



/***
  * Classe utilitaire de tableau d'entiers.
 * @author  Gilles MAMBIDI
 */

public final class TabAlgos {
    /**
     * Constante, valeur maximale d'un tableau.
     * */
    private static final int MAX_VALUE = 256;

    private  TabAlgos(){
        // Just pour eviter son instanciation.
    }

    /**
     * Renvoie la plus grande valeur d'un tableau d'entiers.
     *
     * @param tab le tableau d'entiers à rechercher
     * @return la plus grande valeur du tableau
     */
    public static int plusGrand(final int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    /**
     * @param tab le tableau d'entiers à rechercher.
     * @return moyenne des valeurs du tableau.
     * @throws  IllegalArgumentException si tab et null ou vide.
     **/
    public static double moyenne(final int[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Le tableau ne doit"
                    + " pas être null ou vide.");
        }
        double sum = 0;
        for (final int value : tab) {
            sum += value;
        }
        return sum / tab.length;
    }

    /** Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     * @param tab1 fait reference au premier tableau à comparer
     * @param tab2 fait reference au deuxieme tableau à comparer
     * @return true si les 2 tableaux ont les mêmes éléments
     * et les mêmes nombres d'occurences(avec les elements dans le meme ordre).
     **/
    public static boolean egaux(final int[] tab1,final int[] tab2) {
        boolean res = true;
        if (tab1 == null || tab2 == null || tab1.length != tab2.length) {
            res = false;
        }
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] != tab2[i]) {
                res = false;
            }
        }
        return res;
    }

    /** Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     * @param tab1 fait reference au premier tableau à comparer
     * @param tab2 fait reference au deuxieme tableau à comparer
     * @return true si les 2 tableaux contiennent les mêmes éléments
     * avec les mêmes nombres d'occurrence (pas forcément dans le meme ordre).
     **/
    public static boolean similaires(final int[] tab1, final int[] tab2) {
        boolean result = true;
        if (tab1 == null || tab2 == null || tab1.length != tab2.length) {
            result = false;
        } else {
            int[] count1 = new int[MAX_VALUE];
            int[] count2 = new int[MAX_VALUE];
            for (int i = 0; i < tab1.length; i++) {
                count1[tab1[i]]++;
                count2[tab2[i]]++;
            }
            for (int i = 0; i < count1.length; i++) {
                if (count1[i] != count2[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
