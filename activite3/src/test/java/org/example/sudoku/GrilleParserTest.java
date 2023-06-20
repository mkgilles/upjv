package org.example.sudoku;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import sudoku.*;
import upvj.org.example.sudoku.*;
import upvj.sudoku.*;

class GrilleParserTest {
    /**
     * Method under test: {@link GrilleParser#parse(InputStream)}
     */
    @Test
    void testParse() throws IOException, ElementInterditException, HorsBornesException, ValeurImpossibleException,
            ValeurInitialeModificationException {
        assertThrows(IllegalArgumentException.class,
                () -> GrilleParser.parse(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8"))));
        assertThrows(IllegalArgumentException.class, () -> GrilleParser.parse(new ByteArrayInputStream(new byte[]{})));
    }

    /**
     * Method under test: {@link GrilleParser#parse(InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testParse2() throws IOException, ElementInterditException, HorsBornesException, ValeurImpossibleException,
            ValeurInitialeModificationException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at java.io.Reader.<init>(Reader.java:168)
        //       at java.io.InputStreamReader.<init>(InputStreamReader.java:112)
        //       at upvj.org.example.sudoku.GrilleParser.parse(GrilleParser.java:50)
        //   See https://diff.blue/R013 to resolve this issue.

        GrilleParser.parse(null);
    }
    
   
}

