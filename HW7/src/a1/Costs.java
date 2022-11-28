package a1;

public class Costs implements Visitor {

	@Override
	public void visitGlass(Glass glass) {
		double costs;
		
		if (glass.thickness==1) {
			costs = 2 * ((double)glass.lenght/100);
		} else if (glass.thickness==2) {
			costs = 1.2 * (glass.lenght/100);
		} else if (glass.thickness==3) {
			costs = 0.7 * ((double)glass.lenght/100);
		} else {
			costs = 99999;  //falsche Eigabe
		}
		
		System.out.println("Costs for " + glass.name + ": " + costs + " Euro");
		
	}

	
	
	@Override
	public void visitFurniture(Furniture furniture) {
		double costs = ((double)furniture.weight / 20) * 5;
		
		System.out.println("Costs for " + furniture.name + ": " + costs + " Euro");
		
	}

	
	
	@Override
	public void visitElectronic(Electronic electronic) {
		double costs;
		
		if (electronic.fragile==true) {
			costs = ((double)electronic.weight/10) * 5;
		} else {
			costs = ((double)electronic.weight/15) * 5; 
		}
		System.out.println("Costs for " + electronic.name + ": " + costs + " Euro");
		
	}


	
}