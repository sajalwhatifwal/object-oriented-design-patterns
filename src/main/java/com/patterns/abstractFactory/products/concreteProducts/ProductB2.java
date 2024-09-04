package com.patterns.abstractFactory.products.concreteProducts;

import com.patterns.abstractFactory.products.IProductB;

public class ProductB2 implements IProductB {
    @Override
    public void display() {
        System.out.println("This is the concrete ProductB2 implementation");
    }
}
