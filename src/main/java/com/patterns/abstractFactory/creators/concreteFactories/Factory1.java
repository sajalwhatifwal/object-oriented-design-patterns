package com.patterns.abstractFactory.creators.concreteFactories;

import com.patterns.abstractFactory.creators.IFactoryCreator;
import com.patterns.abstractFactory.products.IProductA;
import com.patterns.abstractFactory.products.IProductB;
import com.patterns.abstractFactory.products.concreteProducts.ProductA1;
import com.patterns.abstractFactory.products.concreteProducts.ProductB1;

public class Factory1 implements IFactoryCreator {
    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
