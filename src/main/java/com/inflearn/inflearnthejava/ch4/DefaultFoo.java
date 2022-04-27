package com.inflearn.inflearnthejava.ch4;

public class DefaultFoo implements Foo{

    private String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("name = " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
