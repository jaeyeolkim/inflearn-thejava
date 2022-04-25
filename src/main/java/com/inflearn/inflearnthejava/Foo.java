package com.inflearn.inflearnthejava;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

  public static void main(String[] args) {
    // @FunctionalInterface 를 만들어 사용하는 경우
    RunSomething runSomething = number -> System.out.println("number = " + number);
    runSomething.doIt(10);

    // 기본으로 제공하는 함수형 인터페이스 사용하는 경우
    Function<Integer, Integer> plus10 = (n) -> n + 10;
    UnaryOperator<Integer> unaryOperator = (n) -> n +10; // 입력/출력 타입이 같으면 Function<T, R> 대신에 UnaryOperator<T> 사용 가능
    Function<Integer, Integer> multiply2 = (n) -> n * 2;
    System.out.println(plus10.compose(multiply2).apply(2)); // 14
    System.out.println(unaryOperator.compose(multiply2).apply(2)); // 14
    System.out.println(plus10.andThen(multiply2).apply(2)); // 24

    // Consumer - 리턴이 없다
    Consumer<Integer> consumer = n -> System.out.println("n = " + n);
    consumer.accept(2); // void

    // Supplier - 받아올 값을 정의
    Supplier<Integer> get10 = () -> 10;
    System.out.println("get10 = " + get10);

    // 인자를 받아서 true/false 를 리턴
    Predicate<String> startWith = (s) -> s.startsWith("kim");
    System.out.println(startWith.test("kimjae"));
    System.out.println(startWith.test("jae"));
    System.out.println(startWith.negate().test("kimjae"));

    Foo foo = new Foo();
    foo.run();
  }

  private void run() {
    int baseNumber = 10;
    IntConsumer printInt = (i) -> System.out.println(i + baseNumber);
    printInt.accept(10);
  }
}
