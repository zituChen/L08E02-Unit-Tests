package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MoneyTest {

    private final Money m12CHF = new Money(12, Currency.CHF);
    private final Money m14CHF = new Money(14, Currency.CHF);

    private final Money m26CHF = new Money(26, Currency.CHF);


    @Test
    void testSimpleAdd() {
        Money expected = new Money(26, Currency.CHF);
        Money observed = m12CHF.add(m14CHF);

        assertEquals(expected, observed);
        // TODO Task 2: implement the assertion
        //fail("Test case not implemented yet");
    }

    @Test
    void testSimpleSubtract() {
        Money expected = new Money(12, Currency.CHF);
        Money observed = m26CHF.subtract(m14CHF);
        assertEquals(expected, observed);
        // TODO Task 3: implement the test case
        //fail("Test case not implemented yet");
    }

    @Test
    void testInvalidAdd() {
        Money m14USD = new Money(14, Currency.USD);

        //Money m13CHF = new Money(13, Currency.USD);
        //Money observed = m14USD.add(m13CHF);

        assertThrows(IllegalArgumentException.class, () -> {
            m14USD.add(m14CHF);
        });

        // TODO Task 4: implement the test case
        //fail("Test case not implemented yet");
    }
}
