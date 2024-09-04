package com.patterns.abstractFactory.products.concreteProducts;

import com.patterns.abstractFactory.products.IProductA;

public class ProductA1 implements IProductA {
    @Override
    public void display() {
        System.out.println("This is the concrete ProductA1 implementation");
    }
}
