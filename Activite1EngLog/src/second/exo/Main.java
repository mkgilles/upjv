package second.exo;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("Plus grand: " + TabAlgos.plusGrand(tab));
        System.out.println("Moyenne: " + TabAlgos.moyenne(tab));
        int[] tab2 = {1, 2, 3, 4, 5};
        System.out.println("Egaux: " + TabAlgos.egaux(tab, tab2));
    }
}