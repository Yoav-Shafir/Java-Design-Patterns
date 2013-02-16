package behavioral.visitor.exe2;

public class Main {
	public static void main(String[] args) {
		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
	
		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tabaco cigars = new Tabaco(19.99);
	
		System.out.println(milk.accept(taxCalc));
		System.out.println(vodka.accept(taxCalc));
		System.out.println(cigars.accept(taxCalc) + "\n");
		
		System.out.println("----- TAX HOLIDAY PRICES -----\n");
		
		System.out.println(milk.accept(taxHolidayCalc));
		System.out.println(vodka.accept(taxHolidayCalc));
		System.out.println(cigars.accept(taxHolidayCalc));
	}
}
