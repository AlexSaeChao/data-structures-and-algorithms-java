package codeChallenge.bracketValidation;

import codechallenge.bracketValidation.bracketValidation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BracketValidationTest {

    @Test
    public void testValidateBrackets_ValidBrackets() {
        // Arrange
        String input = "{}(){}";

        // Act
        boolean result = bracketValidation.validateBrackets(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidateBrackets_InvalidBrackets() {
        // Arragne
        String input = "[({}]";

        // Act
        boolean result = bracketValidation.validateBrackets(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testValidateBrackets_EmptyString() {
        // Arrange
        String input = "";

        // Act
        boolean result = bracketValidation.validateBrackets(input);

        // Asert
        assertTrue(result);
    }

    @Test
    public void testValidateBrackets_NestedBrackets() {
        // Arrange
        String input = "{{([])}}";

        // Act
        boolean result = bracketValidation.validateBrackets(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidateBrackets_WithNonBracketCharacters() {
        // Arrange
        String input = "a(b{c}d)e";

        // Act
        boolean result = bracketValidation.validateBrackets(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testValidateBrackets_InvalidBracketPosition() {
        // Arrange
        String input = "{(})";

        // Act
        boolean result = bracketValidation.validateBrackets(input);

        // Assert
        assertFalse(result);
    }
}


