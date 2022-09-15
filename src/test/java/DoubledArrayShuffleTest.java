import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DoubledArrayShuffleTest {

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testOne(int[] input, int[] expected) {
        int[] result = new DoubledArrayShuffle().findOriginalArray(input);
        Assertions.assertArrayEquals(expected, result);
    }


    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1,3,4,2,6,8}, new int[]{1,3,4}),
                Arguments.of(new int[]{6,3,0,1}, new int[]{})
        );
    }

}