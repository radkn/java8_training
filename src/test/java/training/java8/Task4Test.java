package training.java8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void method() {
        Task4.method(25214903917L, 11, Math.pow(2, 48)).limit(100).forEach(System.out::println);
    }
}