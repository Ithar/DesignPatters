package com.ithar.malik.behavioral.template.pattern;

public class CoffeeBeverage extends CreateBeverageTemplate {

	@Override
	void processThree() {
		System.out.println("CoffeeBeverage: processThree in 'Coffee' class");
	}

	@Override
	void processFour() {
		System.out.println("CoffeeBeverage: processFour in 'Coffee' class");
	}

}
