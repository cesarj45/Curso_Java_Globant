package POO_con_clases_servicio.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @Test
    void discountCalculatorTest() {
        double result = DiscountCalculator.DiscountCalculator(1000);
        assertEquals(200, result);
    }
}
