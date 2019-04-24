package training.java8;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task4 {

    public static LongStream method(long a, int c, double m) {
        return LongStream.iterate(0, x -> new Double((a * x + c) % m).longValue());
    }
}
