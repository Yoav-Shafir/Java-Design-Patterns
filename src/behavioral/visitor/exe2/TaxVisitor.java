package behavioral.visitor.exe2;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxVisitor() {
		
	}
	
	// will be invoke by the Liquor instance which also
	// passes it self as an argument.
	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with Tax");
		return Double.parseDouble(
					df.format( (liquorItem.getPrice() * .18) +  liquorItem.getPrice())
				);
	}
	
	// will be invoke by the Tabaco instance which also
	// passes it self as an argument.
	@Override
	public double visit(Tabaco tabacoItem) {
		System.out.println("Tabaco item: Price with Tax");
		return Double.parseDouble(
					df.format( (tabacoItem.getPrice() * .32) +  tabacoItem.getPrice())
				);
	}
	
	// will be invoke by the Necessity instance which also
	// passes it self as an argument.
	@Override
	public double visit(Necessity necessitytem) {
		System.out.println("Necessity item: Price with Tax");
		return Double.parseDouble(
					df.format( (necessitytem.getPrice() * 0) +  necessitytem.getPrice())
				);
	}

}
