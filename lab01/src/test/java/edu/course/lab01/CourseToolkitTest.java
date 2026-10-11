package edu.course.lab01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(7);
        
        assertTrue(result);
    }

    @Test
    void returnsFalseForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(4);
        
        assertFalse(result);
    }
    @Test
    void returnsFalseForPrimeNumber2() {
        boolean result = CourseToolkit.isPrime(49);
        
        assertFalse(result);
    }
    
    @Test
    void returnsFalseForPrimeNumber3() {
        boolean result = CourseToolkit.isPrime(-5);
        
        assertFalse(result);
    }
    @Test 
    void rerurnsTrueForPalindrome(){
        boolean result = CourseToolkit.isPalindrome("radar");

        assertTrue(result);
    }
    @Test 
    void rerurnsFalseForPalindrome(){
        boolean result = CourseToolkit.isPalindrome("Radar");

        assertFalse(result);
    }
    @Test 
    void rerurnsFalseForPalindrome1(){
        boolean result = CourseToolkit.isPalindrome("hello");

        assertFalse(result);
    }
    @Test
    void throwsExceptionForNullPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
    });
    }
        @Test
    void calculatesAverageForRegularArray() {
        int[] values = {10, 20, 30};
        assertEquals(20.0, CourseToolkit.average(values), 0.001);
    }

    @Test
    void calculatesAverageForNegativeNumbers() {
        int[] values = {-10, 10};
        assertEquals(0.0, CourseToolkit.average(values), 0.001);
    }

    @Test
    void throwsExceptionForEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(new int[]{});
        });
    }
}
