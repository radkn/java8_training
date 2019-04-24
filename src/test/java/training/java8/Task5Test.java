package training.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5Test extends Assert {

    @Test
    public void zip() {
        Stream<String> first = Arrays.stream(new String[]{"a","b","c"});
        Stream<String> second = Arrays.stream(new String[]{"a","b","c","f"});

        Stream<String> actual = Task5.zip(first,second);
        Stream<String> expected = Arrays.stream(new String[]{"a","a","b","b","c","c"});
        assertEquals(expected.collect(Collectors.toList()), actual.collect(Collectors.toList()));
    }
}
