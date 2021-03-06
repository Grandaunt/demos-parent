package com.design.pattern.description;

import com.design.pattern.description.instances.Coffe;
import com.design.pattern.description.instances.AbstractDrink;
import com.design.pattern.description.properties.Milk;

/**
*
*@author Devonmusa
*@date   2017年8月8日
*/
public class DescriptionTest {
	
	public static void main(String[] args) {
		AbstractDrink order ;
		order = new Coffe();
		order.setDescription("coffe");
		order.setPrice(10);
		System.out.println("ORDER PRICE:" + order.getPrice());
		System.out.println("ORDER DESCRIPTION:" + order.getDescription());
		
		Milk milk;
		milk = new Milk(order);
		milk.setDescription("milk");
		milk.setPrice(6);
		System.out.println("Milk PRICE:" + milk.getPrice());
		System.out.println("Milk DESCRIPTION:" + milk.getDescription());
	
	}

}
