package training.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static List<String> upperCaseAndSortDesc(List<String> strs){
        return strs.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
