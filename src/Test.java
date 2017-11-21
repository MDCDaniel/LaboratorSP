
public class Test {
	
	public static void main(String[] args) {

		Carte c = new Carte("Awesome Title",new Cuprins());
		c.getCapitole().add(new Sectiune("Sectiunea I"));

		
		Sectiune a = new Sectiune("Sectiunea I.1");
		a.elemente.add(new Imagine("Imaginee1"));
		a.elemente.add(new Paragraf("Hasannnn",c.leftAlign));
		a.elemente.add(new Paragraf("dsad",c.rightAlign));
		a.elemente.add(new Paragraf("Cosmdd",c.centerAlign));

		
		

		c.getCapitole().add(a);
		
		Sectiune b = new Sectiune("Sectiunea II");
		b.elemente.add(new Paragraf("A paragraph conveying important information",c.rightAlign));
		b.elemente.add(new Imagine("Image moreeeeee"));
		/*TODO
		instantiere documentvizitor
		DocumentStatisticsVisitor dsv = new DocumentStatisticsVisitor();
		parcurgere elemente din carte, contorizare



		 */
		
		c.getCapitole().add(b);
		
		c.printBook();
		
}
}
