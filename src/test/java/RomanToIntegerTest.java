import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @org.junit.jupiter.api.Test
    void test() {
        RomanToInteger r = new RomanToInteger();
        assertEquals(3, r.romanToInt("III"));
        assertEquals(4, r.romanToInt("IV"));
        assertEquals(9, r.romanToInt("IX"));
        assertEquals(58, r.romanToInt("LVIII"));
        assertEquals(1994, r.romanToInt("MCMXCIV"));
    }

}