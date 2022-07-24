import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CountSmallerNumbersTest {

    @Test
    public void test(){
        Assertions.assertEquals(new CountSmallerNumbers().countSmaller(new int[]{5, 2, 6, 1}).toString(), Arrays.toString(new int[]{2,1,1,0}));
        Assertions.assertEquals(new CountSmallerNumbers().countSmaller(new int[]{-1}).toString(), Arrays.toString(new int[]{0}));
    }


    @Test
    public void test2(){
        Assertions.assertEquals(new CountSmallerNumbers().countSmaller2(new int[]{5, 2, 6, 1}).toString(), Arrays.toString(new int[]{2,1,1,0}));
        Assertions.assertEquals(new CountSmallerNumbers().countSmaller2(new int[]{-1}).toString(), Arrays.toString(new int[]{0}));
    }

}