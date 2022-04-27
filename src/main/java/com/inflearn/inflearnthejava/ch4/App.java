package com.inflearn.inflearnthejava.ch4;

public class App {

    public static void main(String[] args) {
        DefaultFoo defaultFoo = new DefaultFoo("jaeyeol");
        defaultFoo.print();
        defaultFoo.printUpper();

        Foo.printFirstName();
    }
}
