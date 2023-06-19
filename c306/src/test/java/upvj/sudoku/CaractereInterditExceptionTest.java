package upvj.sudoku;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CaractereInterditExceptionTest {
    /**
     * Method under test: {@link CaractereInterditException#CaractereInterditException(String)}
     */
    @Test
    void testConstructor() {
        CaractereInterditException actualCaractereInterditException = new CaractereInterditException("foo");
        assertNull(actualCaractereInterditException.getCause());
        assertEquals(0, actualCaractereInterditException.getSuppressed().length);
        assertNull(actualCaractereInterditException.getMessage());
        assertNull(actualCaractereInterditException.getLocalizedMessage());
    }
}

