package com.inflearn.inflearnthejava.ch7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kim");
        names.add("lee");
        names.add("park");
        names.add("moon");

        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("==========");
        while (stringSpliterator.tryAdvance(System.out::println));

        System.out.println("----------");
        names.removeIf(s -> s.startsWith("k"));
        names.forEach(System.out::println);
        System.out.println("==========");

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareToIgnoreCase.reversed());
        names.forEach(System.out::println);

        List<String> collect = names.stream().map(s -> {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            return s;
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        // parallelStream 을 사용하여 병렬처리할 수 있다. 하지만 일반적인 상황에서 병렬처리가 빠르지 않다. 스레드 생성 비용, 컨텍스트 이동 비용등 처리가 더 오래 걸릴수 있다.
        // 대량의 데이터를 처리하는 경우에 이득을 볼 수 있다.
        List<String> parrelCollect = names.parallelStream().map(s -> {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            return s;
        }).collect(Collectors.toList());
        parrelCollect.forEach(System.out::println);
    }
}
