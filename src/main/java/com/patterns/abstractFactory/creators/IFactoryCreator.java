package com.patterns.abstractFactory.creators;

import com.patterns.abstractFactory.products.IProductA;
import com.patterns.abstractFactory.products.IProductB;

public interface IFactoryCreator {
    IProductA createProductA();
    IProductB createProductB();
}
