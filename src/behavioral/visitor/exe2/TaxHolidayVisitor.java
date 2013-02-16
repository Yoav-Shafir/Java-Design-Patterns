package behavioral.visitor.exe2;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor {

DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxHolidayVisitor() {
		
	}
	
	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with Tax");
		return Double.parseDouble(
					df.format( (liquorItem.getPrice() * .10) +  liquorItem.getPrice())
				);
	}

	@Override
	public double visit(Tabaco tabacoItem) {
		System.out.println("Tabaco item: Price with Tax");
		return Double.parseDouble(
					df.format( (tabacoItem.getPrice() * .30) +  tabacoItem.getPrice())
				);
	}

	@Override
	public double visit(Necessity necessitytem) {
		System.out.println("Necessity item: Price with Tax");
		return Double.parseDouble(
					df.format( (necessitytem.getPrice() * 0) +  necessitytem.getPrice())
				);
	}

}
