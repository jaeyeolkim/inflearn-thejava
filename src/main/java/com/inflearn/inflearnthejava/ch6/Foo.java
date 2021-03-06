package com.inflearn.inflearnthejava.ch6;

public interface Foo {

    void print();

    /**
     * @implSpec
     */
    default void printUpper() {
        System.out.println(getName().toUpperCase());
    }

    String getName();

    static void printFirstName() {
        System.out.println("static KIM");
    }
}
