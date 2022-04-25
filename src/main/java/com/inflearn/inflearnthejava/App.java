package com.inflearn.inflearnthejava;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        UnaryOperator<String> hi = Greeting::hi;
        String kim = hi.apply("kim");
        System.out.println("kim = " + kim);

        // 기본 생성자를 참조
        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting greeting = newGreeting.get();

        // name 을 받는 생성자 참조
        Function<String, Greeting> kimGreeting = Greeting::new;
        Greeting jaeyeol = kimGreeting.apply("jaeyeol");

        String[] names = {"b", "c", "a"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
