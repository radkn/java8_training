package training.java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Task1Test extends Assert {

    @Test
    public void testNameFilter(){
        List<String> names = new ArrayList<String>();
        names.add("Ivan");
        names.add("Igor");
        names.add("Peter");
        names.add("Dmytriy");
        names.add("Vova");
        names.add("Olexiy");
        names.add("Viktor");
        names.add("Oleg");
        names.add("Anton");
        names.add("Evgeniy");

        String checkStr = "1. Ivan, 3. Peter, 5. Vova, 7. Viktor, 9. Anton, ";

        assertEquals(checkStr, Task1.nameFilter(names));




    }
}