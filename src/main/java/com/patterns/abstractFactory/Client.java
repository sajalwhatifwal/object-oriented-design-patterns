package com.patterns.abstractFactory;

import com.patterns.abstractFactory.app.Application;
import com.patterns.abstractFactory.creators.IFactoryCreator;
import com.patterns.abstractFactory.creators.concreteFactories.Factory1;
import com.patterns.abstractFactory.creators.concreteFactories.Factory2;

public class Client {

    private static IFactoryCreator initializeFactory(String relevantFactory) {
        relevantFactory = relevantFactory == null ? "" : relevantFactory;
        IFactoryCreator finalFactory = new Factory1();
        if(relevantFactory.equals("FACTORY_1")) {
            finalFactory = new Factory1();
        }
        if(relevantFactory.equals("FACTORY_2")) {
            finalFactory = new Factory2();
        }
        return finalFactory;
    }

    public void execute() {
        IFactoryCreator finalFactory = initializeFactory(System.getenv("ABSTRACT_FACTORY__RELEVANT_FACTORY"));
        Application app = new Application(finalFactory);
        app.display();
    }
}