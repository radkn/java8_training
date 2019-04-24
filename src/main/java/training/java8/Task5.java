package training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("a","b","c");

        Map<Integer,String> map = l.stream().collect(Collectors.toMap(l::indexOf, i->i));
        System.out.println(map);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

        List<T> f = first.collect(Collectors.toList());
        List<T> s = second.collect(Collectors.toList());
        Stream<T> stream = Stream.empty();
        List<T> res = new ArrayList<>();

        if(f.size()>s.size()){
            for (T t : s) {
                res.add(t);
                res.add(f.get(s.indexOf(t)));
            }
//            first.forEach(fe->Stream.concat(stream, Stream.concat(Stream.of(fe),Stream.of(s.remove(0)))));
        }else {

            for (T t : f) {
                res.add(t);
                res.add(s.get(f.indexOf(t)));
            }

        }


        return res.stream();
    }
}
