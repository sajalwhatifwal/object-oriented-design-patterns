package com.patterns.factory.creators.concreteCreators;

import com.patterns.factory.creators.ICreator;
import com.patterns.factory.products.IProduct;
import com.patterns.factory.products.concreteProducts.ProductA;
import org.springframework.context.annotation.Primary;

@Primary
public class CreatorA implements ICreator {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}