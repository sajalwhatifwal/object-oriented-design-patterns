package com.patterns.abstractFactory.creators.concreteFactories;

import com.patterns.abstractFactory.creators.IFactoryCreator;
import com.patterns.abstractFactory.products.IProductA;
import com.patterns.abstractFactory.products.IProductB;
import com.patterns.abstractFactory.products.concreteProducts.ProductA2;
import com.patterns.abstractFactory.products.concreteProducts.ProductB2;

public class Factory2 implements IFactoryCreator {
    @Override
    public IProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB2();
    }
}
