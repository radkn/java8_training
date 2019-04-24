package training.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> separateByCommas(List<String> strs){

        return strs.stream()
                .flatMap(s -> Arrays.stream(s.split(", ")))
                        .collect(Collectors.toList());
    }
}
