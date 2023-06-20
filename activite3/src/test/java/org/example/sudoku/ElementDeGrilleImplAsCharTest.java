package org.example.sudoku;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import upvj.sudoku.ElementDeGrilleImplAsChar;

class ElementDeGrilleImplAsCharTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ElementDeGrilleImplAsChar#ElementDeGrilleImplAsChar(char)}
     *   <li>{@link ElementDeGrilleImplAsChar#setValue(char)}
     *   <li>{@link ElementDeGrilleImplAsChar#getValue()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ElementDeGrilleImplAsChar actualElementDeGrilleImplAsChar = new ElementDeGrilleImplAsChar('A');
        actualElementDeGrilleImplAsChar.setValue('A');
        assertEquals('A', actualElementDeGrilleImplAsChar.getValue());
    }
}

