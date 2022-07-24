import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CommonPrefixTest {


    @Test
    void test() {
        CommonPrefix toTest = new CommonPrefix();
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("foo", "bar").toArray(String[]::new)), "");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("flower","flow","flight").toArray(String[]::new)), "fl");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("dog","racecar","car").toArray(String[]::new)), "");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("dog","dog","dogg").toArray(String[]::new)), "dog");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("a").toArray(String[]::new)), "a");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("flower","flower","flower","flower").toArray(String[]::new)), "flower");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("abab","aba","").toArray(String[]::new)), "");
        assertEquals(toTest.longestCommonPrefix( Arrays.asList("aac","a","ccc").toArray(String[]::new)), "");
    }
    @Test
    void test2() {
        CommonPrefix toTest = new CommonPrefix();
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("foo", "bar").toArray(String[]::new)), "");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("flower","flow","flight").toArray(String[]::new)), "fl");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("dog","racecar","car").toArray(String[]::new)), "");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("dog","dog","dogg").toArray(String[]::new)), "dog");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("a").toArray(String[]::new)), "a");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("flower","flower","flower","flower").toArray(String[]::new)), "flower");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("abab","aba","").toArray(String[]::new)), "");
        assertEquals(toTest.longestCommonPrefix2( Arrays.asList("aac","a","ccc").toArray(String[]::new)), "");
    }

}