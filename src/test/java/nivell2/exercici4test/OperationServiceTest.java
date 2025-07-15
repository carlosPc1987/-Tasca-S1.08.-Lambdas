package nivell2.exercici4test;

import org.example.nivell2.exercici3.interfaces.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class OperationServiceTest {

    @Test
    void givenTwoNumbers_whenAdded_thenReturnsCorrectSum() {
        Operation sum = () -> 10 + 5;
        assertEquals(15.0f, sum.operate(), 0.001);
    }

    @Test
    void givenTwoNumbers_whenSubtracted_thenReturnsCorrectDifference() {
        Operation subtract = () -> 10 - 3;
        assertEquals(7.0f, subtract.operate(), 0.001);
    }

    @Test
    void givenTwoNumbers_whenMultiplied_thenReturnsCorrectProduct() {
        Operation multiply = () -> 4 * 2.5f;
        assertEquals(10.0f, multiply.operate(), 0.001);
    }

    @Test
    void givenTwoNumbers_whenDivided_thenReturnsCorrectQuotient() {
        Operation divide = () -> 20 / 5f;
        assertEquals(4.0f, divide.operate(), 0.001);
    }

    @Test
    void givenDivisionByZero_whenDivided_thenReturnsNaNOrInfinity() {
        Operation divide = () -> 20 / 0f;
        float result = divide.operate();
        assertTrue(Float.isNaN(result) || Float.isInfinite(result));
    }
}

