package com.beverages.test;

import org.junit.Assert;
import org.junit.Test;

import com.beverages.factory.BeverageFactory;

public class BeveragesFactoryTest {

	BeverageFactory beverageFactory = new BeverageFactory();
	
	@Test
    public void testCaseForSimpleOrder() {
        Assert.assertEquals(2.5d, beverageFactory.getTotalCostOfOrder("Chai,-milk,-water"), 0.0d);
    }

    @Test()
    public void testCaseForComplexOrder() {
        String order = "Chai,        -milk,     -water, Mojito,-mint, Banana Smoothie, Strawberry Shake";
        Assert.assertEquals(22.5d, beverageFactory.getTotalCostOfOrder(order), 0.0d);
    }
    
}
