package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

class SixDigitNumberGeneratorTest {

    @Test
    void shouldGenerateCorrectAmountOfSixDigitNumbers() {
        List<Integer> numbers = Wonderland.generateSixDigitNumbers();
        assertEquals(900000, numbers.size());
    }

    @Test
    void shouldStartAt100000() {
        List<Integer> numbers = Wonderland.generateSixDigitNumbers();
        assertEquals(100000, numbers.getFirst());
    }

    @Test
    void shouldEndAt999999() {
        List<Integer> numbers = Wonderland.generateSixDigitNumbers();
        assertEquals(999999, numbers.getLast());
    }

    @Test
    void allNumbersShouldHaveSixDigits() {
        List<Integer> numbers = Wonderland.generateSixDigitNumbers();
        for (int n : numbers) {
            assertTrue(n >= 100000 && n <= 999999);
        }
    }
}

class WonderlandValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "123456, false",
            "111111, false",
            "100000, false",
            "142857, true"
    })
    void shouldValidateWonderlandNumbers(int n, boolean expected) {
        assertEquals(expected, Wonderland.isWonderlandNumber(n));
    }
}