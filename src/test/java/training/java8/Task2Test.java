package training.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task2Test extends Assert {

    @Test
    public void upperCaseAndSortDesc() {
        List<String> strs1 = new ArrayList<String>();
        strs1.add("Igor");
        strs1.add("Ivan");
        strs1.add("Peter");
        strs1.add("Dmytriy");
        strs1.add("Vova");

        List<String> checkStrs = new ArrayList<String>();
        checkStrs.add("VOVA");
        checkStrs.add("DMYTRIY");
        checkStrs.add("IVAN");
        checkStrs.add("IGOR");
        checkStrs.add("PETER");


        assertEquals(checkStrs, Task2.upperCaseAndSortDesc(strs1));

    }
}