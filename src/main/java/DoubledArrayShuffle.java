import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubledArrayShuffle {

    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[]{};
        }

        List<Integer> sorted = Arrays.stream(changed).sorted().boxed().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        while (sorted.size() > 1) {
            int i = whereIsDoubledNumber(sorted);
            if (i > 0) {
                resultList.add(sorted.get(0));
                sorted.remove(i);
                sorted.remove(0);
            } else {
                resultList = new ArrayList<>();
                break;
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int whereIsDoubledNumber(List<Integer> sortedArray) {
        for (int i = 1; i < sortedArray.size(); i++) {
            if (sortedArray.get(0) * 2 == sortedArray.get(i)) {
                return i;
            }
        }
        return -1;
    }

}
