package malik.behavioral.template.pattern;

public class ApplicationRun {

	public static void main(String[] args) {

		TeaBeverage tea = new TeaBeverage();
		CoffeeBeverage coffee = new CoffeeBeverage();
		
		System.out.println("Doing 'Tea' ......");
		tea.doAlgorithum();
		System.out.println("\n\n");
		System.out.println("Doing 'Coffee' ......");
		coffee.doAlgorithum();
	}

}
