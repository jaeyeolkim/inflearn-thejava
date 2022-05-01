package com.inflearn.inflearnthejava.ch6;

public class App {

    public static void main(String[] args) {
        DefaultFoo defaultFoo = new DefaultFoo("jaeyeol");
        defaultFoo.print();
        defaultFoo.printUpper();

        Foo.printFirstName();
    }
}
