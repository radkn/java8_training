package training.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void separateByCommas() {

        List<String> strResult = Task3.separateByCommas(Arrays.asList ("1, 2, 0", "4, 5"));
        List<String> strToCheck = Arrays.asList("1","2","0","4","5");

        assertEquals(strToCheck,strResult);
    }
}