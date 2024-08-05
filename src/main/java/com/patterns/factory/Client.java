package com.patterns.factory;

import com.patterns.factory.creators.ICreator;
import com.patterns.factory.creators.concreteCreators.CreatorA;
import com.patterns.factory.creators.concreteCreators.CreatorB;
import com.patterns.factory.products.IProduct;

public class Client {

    private static ICreator initializeCreator(String relevantProduct) {
        relevantProduct = relevantProduct == null ? "" : relevantProduct;
        ICreator finalCreator = new CreatorA();
        if(relevantProduct.equals("PRODUCT_A")) {
            finalCreator = new CreatorA();
        }
        if(relevantProduct.equals("PRODUCT_B")) {
            finalCreator = new CreatorB();
        }
        return finalCreator;
    }

    public void execute() {
        ICreator finalCreator = initializeCreator(System.getenv("RELEVANT_PRODUCT"));
        IProduct finalProduct = finalCreator.createProduct();
        finalProduct.display();
    }
}