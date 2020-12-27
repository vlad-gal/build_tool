package by.halatsevich.utils.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void testIsPositiveNumberSuccess() {
        boolean condition = StringUtils.isPositiveNumber("31");
        assertTrue(condition);
    }

    @Test
    void testIsPositiveNumberFailure() {
        boolean condition = StringUtils.isPositiveNumber("-39");
        assertFalse(condition);
    }
}