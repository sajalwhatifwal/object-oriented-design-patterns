package com.patterns.abstractFactory.products.concreteProducts;

import com.patterns.abstractFactory.products.IProductB;

public class ProductB1 implements IProductB {
    @Override
    public void display() {
        System.out.println("This is the concrete ProductB1 implementation");
    }
}
