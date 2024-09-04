package com.patterns.abstractFactory.products;

public interface IProductB {
    default void display() {
        System.out.println("This is the ProductB interface");
    }
}
