package com.patterns.factory.products.concreteProducts;

import com.patterns.factory.products.IProduct;
import org.springframework.context.annotation.Primary;

@Primary
public class ProductA implements IProduct {
    @Override
    public void display() {
        System.out.println("This is the concrete ProductA implementation");
    }
}