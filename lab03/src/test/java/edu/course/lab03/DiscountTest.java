package edu.course.lab03;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DiscountTest {
    @Test
    void noDiscountShouldReturnOriginalPrice() {
        PriceCalculator calc = new PriceCalculator(new NoDiscount());
        assertEquals(100.0, calc.calculateFinalPrice(100.0));
    }
    @Test
    void percentDiscountShouldApplyCorrectly() {
        PriceCalculator calc = new PriceCalculator(new PercentDiscount(20));
        assertEquals(80.0, calc.calculateFinalPrice(100.0));
    }
    @Test
    void shouldThrowExceptionForInvalidPercent() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PercentDiscount(150);
        });
    }
    @Test
    void shouldShowReplaceability() {
        PriceCalculator calc = new PriceCalculator(new NoDiscount());
        assertEquals(100.0, calc.calculateFinalPrice(100.0));
        calc = new PriceCalculator(new PercentDiscount(50));
        assertEquals(50.0, calc.calculateFinalPrice(100.0));
    }
}