package ke.co.safaricom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherEncodingTest {

    @Test
    @DisplayName("Caesar Cipher Encoding a Single LowerCase Character and No Wrap Around")
    void encodeSingleLowerCaseCharacterNoWrapAround() {
        assertEquals("b", CipherEncoding.encode("a", 1));
        assertEquals("e", CipherEncoding.encode("c", 2));
        assertEquals("i", CipherEncoding.encode("b", 7));
        assertEquals("z", CipherEncoding.encode("t", 6));
        assertEquals("h", CipherEncoding.encode("e", 3));
        assertEquals("y", CipherEncoding.encode("x", 1));
        assertEquals("z", CipherEncoding.encode("y", 1));
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", CipherEncoding.encode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",3));
    }
}