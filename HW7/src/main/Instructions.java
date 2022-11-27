package main;

public class Instructions implements Visitor {

	@Override
	public void visitGlass(Glass glass) {
		int height = glass.height+1;
		int length = glass.lenght+1;
		int width = glass.width+1;
		System.out.println(glass.name + " should be packed in: " + height + "x" + length + "x" + width);
		
	}

	@Override
	public void visitFurniture(Furniture furniture) {

		System.out.println(furniture.name + " should be packed in " + furniture.lenght + "x" + furniture.width);
		
	}

	@Override
	public void visitElectronic(Electronic electronic) {
		int height = electronic.height+1;
		int length = electronic.lenght+1;
		int width = electronic.width+1;
		System.out.println(electronic.name + " should be packed in: " + height + "x" + length + "x" + width);
		
	}

}
