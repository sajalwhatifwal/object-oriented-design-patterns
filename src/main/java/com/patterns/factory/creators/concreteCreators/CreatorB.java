package com.patterns.factory.creators.concreteCreators;

import com.patterns.factory.creators.ICreator;
import com.patterns.factory.products.IProduct;
import com.patterns.factory.products.concreteProducts.ProductB;

public class CreatorB implements ICreator {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}