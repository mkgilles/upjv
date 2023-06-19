package upvj.sudoku;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

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
        //       at upvj.sudoku.GrilleParser.parse(GrilleParser.java:50)
        //   See https://diff.blue/R013 to resolve this issue.

        GrilleParser.parse(null);
    }

    /**
     * Method under test: {@link GrilleParser#parse(InputStream)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testParse3() throws IOException, ElementInterditException, HorsBornesException, ValeurImpossibleException,
            ValeurInitialeModificationException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.io.IOException: Stream Closed
        //       at java.io.FileInputStream.readBytes(Native Method)
        //       at java.io.FileInputStream.read(FileInputStream.java:276)
        //       at sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:270)
        //       at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:313)
        //       at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:188)
        //       at java.io.InputStreamReader.read(InputStreamReader.java:177)
        //       at java.io.BufferedReader.fill(BufferedReader.java:162)
        //       at java.io.BufferedReader.readLine(BufferedReader.java:329)
        //       at java.io.BufferedReader.readLine(BufferedReader.java:396)
        //       at upvj.sudoku.GrilleParser.parse(GrilleParser.java:55)
        //   See https://diff.blue/R013 to resolve this issue.

        GrilleParser.parse(new FileInputStream(new FileDescriptor()));
    }
}

