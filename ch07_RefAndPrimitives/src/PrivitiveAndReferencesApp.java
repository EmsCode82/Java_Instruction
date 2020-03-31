
public class PrivitiveAndReferencesApp {

	public static void main(String[] args) {
		System.out.println("Hello");

		System.out.println("Primative Types");
		double p1 = 57.50;
		double p2 = p1;
		p1 = 45.50;
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);

		Product product1 = new Product("java", "Murach's", 57.50);
		Product product2 = product1;
		Product product3 = new Product("java", "Murach's", 57.50);
		System.out.println("product1 == product2: " + (product1 == product2));
		System.out.println("product1 == product3: " + (product1 == product3));

		double p3 = 50.0;
		System.out.println("p3 = " + p3);
		p3 = changeDouble2(p3);
		System.out.println("p3 = " + p3);
		System.out.println("Bye");
		
		changePrice(product1);
		System.out.println(product1);
	}

	private static void changeDouble(double d) {
		// increase 10%
		System.out.println("d = " + d);
		d *= 1.1;
		System.out.println("d = " + d);
	}

	private static double changeDouble2(double d) {
		// increase 10%
		System.out.println("d = " + d);
		d *= 1.1;
		System.out.println("d = " + d);
		return d;

	}
	
	private static void changePrice(Product p) {
	    double d = p.getPrice();
	    d *= 1.1;
	    p.setPrice(d);
	}
}
