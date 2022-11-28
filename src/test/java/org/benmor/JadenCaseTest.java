package org.benmor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {

        JadenCase jadenCase = new JadenCase();

        @Test
        public void test() {
        assertEquals( "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

        @Test
        public void testNullArg() {
        assertNull(null, jadenCase.toJadenCase(null));
    }

        @Test
        public void testEmptyArg() {
        assertNull(null, jadenCase.toJadenCase(""));
    }

}