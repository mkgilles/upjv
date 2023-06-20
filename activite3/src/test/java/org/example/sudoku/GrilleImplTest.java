package org.example.sudoku;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import upvj.sudoku.*;

class GrilleImplTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GrilleImpl#GrilleImpl(ElementDeGrille[])}
     *   <li>{@link GrilleImpl#getDimension()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals(1, (new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).getDimension());
    }

    /**
     * Method under test: {@link GrilleImpl#GrilleImpl(ElementDeGrille[])}
     */
    @Test
    void testConstructor2() {
        GrilleImpl actualGrilleImpl = new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')});
        assertEquals(1, actualGrilleImpl.getDimension());
        assertFalse(actualGrilleImpl.isComplete());
    }

    /**
     * Method under test: {@link GrilleImpl#getElements()}
     */
    @Test
    void testGetElements() {
        assertTrue((new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).getElements().isEmpty());
    }

    /**
     * Method under test: {@link GrilleImpl#getValue(int, int)}
     */
    @Test
    void testGetValue() throws HorsBornesException {
        assertThrows(HorsBornesException.class,
                () -> (new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).getValue(2, 3));
        assertNull((new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).getValue(0, 0));
        assertThrows(HorsBornesException.class,
                () -> (new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).getValue(-1, 3));
    }

    /**
     * Method under test: {@link GrilleImpl#getValue(int, int)}
     */
    @Test
    void testGetValue2() throws HorsBornesException {
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('\u0002');
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar2 = new ElementDeGrilleImplAsChar('\u0002');
        assertThrows(HorsBornesException.class, () -> (new GrilleImpl(new ElementDeGrille[]{elementDeGrilleImplAsChar,
                elementDeGrilleImplAsChar2, new ElementDeGrilleImplAsChar('\u0002')})).getValue(2, 3));
    }

    /**
     * Method under test: {@link GrilleImpl#getValue(int, int)}
     */
    @Test
    void testGetValue3() throws HorsBornesException {
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('\u0002');
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar2 = new ElementDeGrilleImplAsChar('\u0002');
        assertThrows(HorsBornesException.class, () -> (new GrilleImpl(new ElementDeGrille[]{elementDeGrilleImplAsChar,
                elementDeGrilleImplAsChar2, new ElementDeGrilleImplAsChar('\u0002')})).getValue(2, -1));
    }

    /**
     * Method under test: {@link GrilleImpl#isComplete()}
     */
    @Test
    void testIsComplete() {
        assertFalse((new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).isComplete());
        assertTrue((new GrilleImpl(new ElementDeGrille[]{})).isComplete());
    }

    /**
     * Method under test: {@link GrilleImpl#isPossible(int, int, ElementDeGrille)}
     */
    @Test
    void testIsPossible() throws ElementInterditException, HorsBornesException {
        GrilleImpl grilleImpl = new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')});
        assertThrows(HorsBornesException.class, () -> grilleImpl.isPossible(2, 3, new ElementDeGrilleImplAsChar('A')));
    }

    /**
     * Method under test: {@link GrilleImpl#isPossible(int, int, ElementDeGrille)}
     */
    @Test
    void testIsPossible2() throws ElementInterditException, HorsBornesException {
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('\u0002');
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar2 = new ElementDeGrilleImplAsChar('\u0002');
        GrilleImpl grilleImpl = new GrilleImpl(new ElementDeGrille[]{elementDeGrilleImplAsChar,
                elementDeGrilleImplAsChar2, new ElementDeGrilleImplAsChar('\u0002')});
        assertThrows(HorsBornesException.class, () -> grilleImpl.isPossible(2, 3, new ElementDeGrilleImplAsChar('A')));
    }

    /**
     * Method under test: {@link GrilleImpl#isPossible(int, int, ElementDeGrille)}
     */
    @Test
    void testIsPossible3() throws ElementInterditException, HorsBornesException {
        GrilleImpl grilleImpl = new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')});
        assertThrows(HorsBornesException.class, () -> grilleImpl.isPossible(-1, 3, new ElementDeGrilleImplAsChar('A')));
    }

    /**
     * Method under test: {@link GrilleImpl#isPossible(int, int, ElementDeGrille)}
     */
    @Test
    void testIsPossible4() throws ElementInterditException, HorsBornesException {
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('\u0002');
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar2 = new ElementDeGrilleImplAsChar('\u0002');
        GrilleImpl grilleImpl = new GrilleImpl(new ElementDeGrille[]{elementDeGrilleImplAsChar,
                elementDeGrilleImplAsChar2, new ElementDeGrilleImplAsChar('\u0002')});
        assertThrows(ElementInterditException.class,
                () -> grilleImpl.isPossible(2, 2, new ElementDeGrilleImplAsChar('A')));
    }

    /**
     * Method under test: {@link GrilleImpl#isPossible(int, int, ElementDeGrille)}
     */
    @Test
    void testIsPossible5() throws ElementInterditException, HorsBornesException {
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('\u0002');
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar2 = new ElementDeGrilleImplAsChar('\u0002');
        GrilleImpl grilleImpl = new GrilleImpl(new ElementDeGrille[]{elementDeGrilleImplAsChar,
                elementDeGrilleImplAsChar2, new ElementDeGrilleImplAsChar('\u0002')});
        assertThrows(HorsBornesException.class, () -> grilleImpl.isPossible(2, -1, new ElementDeGrilleImplAsChar('A')));
    }

    /**
     * Method under test: {@link GrilleImpl#isPossible(int, int, ElementDeGrille)}
     */
    @Test
    void testIsPossible6() throws ElementInterditException, HorsBornesException {
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('\u0002');
        ElementDeGrilleImplAsChar elementDeGrilleImplAsChar2 = new ElementDeGrilleImplAsChar('\u0002');
        assertTrue((new GrilleImpl(new ElementDeGrille[]{elementDeGrilleImplAsChar, elementDeGrilleImplAsChar2,
                new ElementDeGrilleImplAsChar('\u0002')})).isPossible(2, 2, null));
    }

    /**
     * Method under test: {@link GrilleImpl#isValeurInitiale(int, int)}
     */
    @Test
    void testIsValeurInitiale() {
        assertFalse((new GrilleImpl(new ElementDeGrille[]{new ElementDeGrilleImplAsChar('A')})).isValeurInitiale(2, 3));
    }
    
   
}

