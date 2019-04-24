package training.java8;

import java.util.List;

public class Task1 {

    public static String nameFilter(List<String> names){
        StringBuilder result = new StringBuilder();

        names.stream()
                .filter(name->(names.indexOf(name)%2==0))
                .map(name->(names.indexOf(name)+1)+". "+name)
               .forEach(name -> result.append(name).append(", "));
        return result.toString();
    }
}
