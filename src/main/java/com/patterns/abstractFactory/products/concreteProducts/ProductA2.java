package com.patterns.abstractFactory.products.concreteProducts;

import com.patterns.abstractFactory.products.IProductA;

public class ProductA2 implements IProductA {
    @Override
    public void display() {
        System.out.println("This is the concrete ProductA2 implementation");
    }
}
