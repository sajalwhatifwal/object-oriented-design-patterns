package com.patterns.factory.creators;

import com.patterns.factory.products.IProduct;

public interface ICreator {
    IProduct createProduct();
}