package com.patterns.factory.products;
public interface IProduct {
    default void display() {
        System.out.println("This is the Product interface");
    }
}