import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSmallerNumbers {

    public List<Integer> countSmaller(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    result[i] = result[i] + 1;
                }
            }
        }

        return IntStream.of(result).boxed().collect(Collectors.toList());
    }

    public List<Integer> countSmaller2(int[] nums) {
        int min = 20001;
        int max = -1;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        min--;
        int[] count = new int[max-min+1];
        Integer[] result = new Integer[nums.length];
        for (int i = nums.length-1; i >=0; i--) {
            int k = nums[i]-min-1;
            int c = 0;
            do {
                c += count[k];
                k -= (-k&k);
            } while (k > 0);
            result[i] = c;

            k = nums[i]-min;
            while (k < count.length) {
                count[k]++;
                k += (-k&k);
            }
        }

        return Arrays.asList(result);
    }

}
