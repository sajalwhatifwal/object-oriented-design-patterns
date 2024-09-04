package com.patterns.abstractFactory.app;

import com.patterns.abstractFactory.creators.IFactoryCreator;
import com.patterns.abstractFactory.products.IProductA;
import com.patterns.abstractFactory.products.IProductB;

public class Application {
    private final IProductA productA;
    private final IProductB productB;

    public Application(IFactoryCreator factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void display() {
        productA.display();
        productB.display();
    }
}
