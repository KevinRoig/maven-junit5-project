package fr.wildcodeschool.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import fr.wildcodeschool.unittesting.StringUtils;

public class StringUtilsTest {
    @Test
    public void vowels_Success() {
        assertEquals("eo", StringUtils.vowels("Hello"));
        assertEquals("AI", StringUtils.vowels("PANTIN"));
        assertEquals("aeiouyAEIOUY", StringUtils.vowels("aeiouyAEIOUY"));
    }

    @Test
    public void vowels_Fail(){
        assertNotEquals("edsvo", StringUtils.vowels("Hello"));
        assertNotEquals("AIjoiu", StringUtils.vowels("PANTIN"));
        assertNotEquals("vgdf", StringUtils.vowels("aeiouyAEIOUY"));    }

    @Test
    public void vowels_Empty() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.vowels("");
        });
        assertEquals("candidate is empty", exception.getMessage());
    }
    
    @Test
    public void uniqueVowels_Success() {
        assertEquals("eo", StringUtils.uniqueVowels("Hellooo"));
        assertEquals("AI", StringUtils.uniqueVowels("PAAAAAAAANTIIN"));
        assertEquals("aeiouyAEIOUY", StringUtils.uniqueVowels("aaaeeeiiiooouuuyyyAAEEEEIIOOOOUUUUYYY"));
    }

    @Test
    public void uniqueVowels_Fail(){
        assertNotEquals("edsvo", StringUtils.uniqueVowels("Hello"));
        assertNotEquals("AIjoiu", StringUtils.uniqueVowels("PANTIN"));
        assertNotEquals("vgdf", StringUtils.uniqueVowels("aeiouyAEIOUY"));    
    }

    @Test
    public void uniqueVowels_Empty() {
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.uniqueVowels("");
        });
        assertEquals("candidate is empty", exception.getMessage());
    }
       
    @Test
    public void uniqueVowels_NoVowels_Success() {
        assertEquals("", StringUtils.uniqueVowels("PNTNhfd"));
        assertEquals("", StringUtils.uniqueVowels("!!''564"));
    }
}
