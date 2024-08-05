package com.patterns.factory.products.concreteProducts;

import com.patterns.factory.products.IProduct;
public class ProductB implements IProduct {
    @Override
    public void display() {
        System.out.println("This is the concrete ProductB implementation");
    }
}