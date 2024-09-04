package com.patterns.abstractFactory.products;

public interface IProductA {
    default void display() {
        System.out.println("This is the ProductA interface");
    }
}
