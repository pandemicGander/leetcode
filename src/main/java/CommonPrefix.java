import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String[] distinct = Arrays.stream(strs).distinct().toArray(String[]::new);
        if (distinct.length == 1) {
            return strs[0];
        }
        if (Arrays.stream(strs).map(String::length).anyMatch(len -> len == 0)) {
            return "";
        }

        Map<String, String> result = new HashMap<>();

        for (String str : strs) {
            for (int i = 1; i <= 200; i++) {
                boolean kill = false;
                if (i > str.length()) {
                    break;
                }
                String checker = str.substring(0, i);
                for (String s : strs) {
                    if (s.equals(str)) {
                        continue;
                    }
                    if (s.startsWith(checker)) {
                        result.put(str, checker);
                        break;
                    } else {
                        kill = true;
                        break;
                    }
                }
                if (kill) {
                    break;
                }
            }
        }

        if (result.keySet().stream().distinct().toArray().length != distinct.length) {
            return "";
        }

        return result.values().stream().sorted().findFirst().orElse("");

    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

}
