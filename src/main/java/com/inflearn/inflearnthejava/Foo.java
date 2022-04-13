package com.inflearn.inflearnthejava;

public class Foo {

  public static void main(String[] args) {
    RunSomething runSomething = number -> System.out.println("number = " + number);

    runSomething.doIt(10);
  }
}
