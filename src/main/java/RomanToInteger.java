import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RomanToInteger {

    private static final Map<String, Integer> romanToIntMap = new HashMap<>();

    static {
        romanToIntMap.put("I", 1);
        romanToIntMap.put("V", 5);
        romanToIntMap.put("X", 10);
        romanToIntMap.put("L", 50);
        romanToIntMap.put("C", 100);
        romanToIntMap.put("D", 500);
        romanToIntMap.put("M", 1000);
    }

    public int romanToInt(String s) {


        return Arrays.stream(s.split("")).reduce((List<Integer>) new ArrayList<Integer>(), (integers, s1) -> {
            if (getLast(integers, 0).equals(1) && (s1.equals("V") || s1.equals("X"))) {
                integers.add(romanToIntMap.get(s1) - 2);
            } else if (getLast(integers, 0).equals(10) && (s1.equals("L") || s1.equals("C"))) {
                integers.add(romanToIntMap.get(s1) - 20);
            } else if (getLast(integers, 0).equals(100) && (s1.equals("D") || s1.equals("M"))) {
                integers.add(romanToIntMap.get(s1) - 200);
            } else {
                integers.add(romanToIntMap.get(s1));
            }
            return integers;
        }, (integers, integers2) -> {
            return Stream.concat(integers.stream(), integers2.stream())
                    .collect(Collectors.toList());
        }).stream().reduce(Integer::sum).orElse(0);
    }

    private static <T> T getLast(List<T> list, T defaultValue) {
        if (list.isEmpty()) {
            return defaultValue;
        }
        return list.get(list.size() - 1);
    }

}
