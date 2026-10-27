package com.example.invioce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// Import using the lowercase class name to match the file above
import com.example.invoice.invoiceCalculator;

public class InvoiceCalculatorTest {
    
    // Lowercase 'i' in invoiceCalculator
    invoiceCalculator invoice = new invoiceCalculator();

    @Test
    void testProductAmount() {
        assertEquals(5000.0, invoice.calculateProductAmount(2500.0, 2));
    }

    @Test
    void testTenPercentDiscount() {
        assertEquals(500.0, invoice.calculateDiscount(5000.0));
    }

    @Test
    void testFivePercentDiscount() {
        assertEquals(150.0, invoice.calculateDiscount(3000.0));
    }

    @Test
    void testNoDiscount() {
        assertEquals(0.0, invoice.calculateDiscount(1000.0));
    }
}
